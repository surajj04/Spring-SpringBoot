import { useEffect, useState } from "react";
import Card from "../components/Card";
import axios from "axios";

const Cards = () => {

    const [data, setData] = useState(null)
    const [keyword, setKeyword] = useState('');




    useEffect(() => {

        const search = async () => {
            const response = await axios.get('http://localhost:8080/job/search/' + keyword);
            setData(response.data);
        }

        const fetchIntialPost = async () => {
            const response = await axios.get("http://localhost:8080/jobs");
            setData(response.data);
        };

        fetchIntialPost();
        if (keyword.length == 0) fetchIntialPost();
        if (keyword.length > 2) search();

    }, [keyword]);


    const handleDelete = (id) => {
        axios.delete("http://localhost:8080/job/" + id)
        window.location.reload();
    }




    return (

        <>
            <div className="mx-auto w-50 my-4">
                <form className="d-flex" role="search">
                    <input
                        className="form-control me-2 py-2"
                        type="search"
                        placeholder="Search"
                        aria-label="Search"
                        value={keyword}
                        onChange={(e) => setKeyword(e.target.value)}
                    />
                    <button className="btn btn-outline-success" type="submit">
                        Search
                    </button>
                </form>
            </div>

            <div className="row mx-4 my-4">


                {
                    data && data.map((job) => (
                        <div className="col-12 col-sm-6 col-md-4 col-lg-3 my-3" key={job.id}>
                            <Card
                                id={job.id}
                                title={job.title}
                                desc={job.description}
                                skills={job.skills}
                                company={job.company}
                                location={job.location}
                                employmentType={job.employmentType}
                                datePosted={job.datePosted}
                                exp={job.experience}
                                handleDelete={handleDelete}
                            />
                        </div>
                    ))
                }
            </div>


            

        </>
    );
}

export default Cards;
