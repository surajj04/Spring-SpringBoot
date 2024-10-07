package org.bytetech.SpringRestApi.Repositroy;

import org.bytetech.SpringRestApi.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepositroy {

    private static List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,
                    "Software Engineer",
                    "New York, NY",
                    3,
                    "We are looking for a skilled Software Engineer to join our development team. You will be responsible for developing high-quality software solutions.",
                    Arrays.asList("JavaScript", "React", "Node.js", "SQL", "Git"),
                    "Tech Innovations",
                    "Full-time",
                    "2024-09-25",
                    "3+ years in software development, with a focus on web applications."),

            new JobPost(2,
                    "Product Manager",
                    "San Francisco, CA",
                    5,
                    "Seeking a Product Manager to lead product development initiatives. You will work closely with engineering and marketing teams.",
                    Arrays.asList("Agile Methodologies", "User Experience Design", "Market Research", "Communication", "Project Management"),
                    "Creative Solutions",
                    "Full-time",
                    "2024-09-20",
                    "5 years of experience in product management, with a track record of successful product launches."),

            new JobPost(3,
                    "Graphic Designer",
                    "Austin, TX",
                    2,
                    "Looking for a creative Graphic Designer to create engaging visual content for various platforms.",
                    Arrays.asList("Adobe Creative Suite", "Typography", "Branding", "Illustration", "HTML/CSS"),
                    "Design Studio",
                    "Part-time",
                    "2024-09-22",
                    "2+ years in graphic design with a strong portfolio of creative projects."),

            new JobPost(4,
                    "Data Analyst",
                    "Chicago, IL",
                    4,
                    "Join our team as a Data Analyst to interpret data and provide actionable insights.",
                    Arrays.asList("Excel", "SQL", "Python", "Data Visualization", "Statistical Analysis"),
                    "Analytics Corp",
                    "Full-time",
                    "2024-09-15",
                    "4 years of experience in data analysis with proficiency in data visualization tools."),

            new JobPost(5,
                    "Marketing Specialist",
                    "Los Angeles, CA",
                    3,
                    "We are looking for a Marketing Specialist to develop and execute marketing strategies.",
                    Arrays.asList("SEO", "Content Marketing", "Social Media", "Email Marketing", "Analytics"),
                    "Marketing Masters",
                    "Full-time",
                    "2024-09-10",
                    "3 years of experience in marketing, with a focus on digital marketing strategies."),

            new JobPost(6,
                    "Sales Representative",
                    "Miami, FL",
                    2,
                    "Seeking a motivated Sales Representative to drive sales and build customer relationships.",
                    Arrays.asList("Communication", "Negotiation", "CRM Software", "Customer Service", "Sales Strategy"),
                    "Sales Solutions",
                    "Full-time",
                    "2024-09-05",
                    "2+ years of experience in sales, with a proven track record of meeting sales targets."),

            new JobPost(7,
                    "Project Coordinator",
                    "Seattle, WA",
                    1,
                    "Looking for a Project Coordinator to assist in project management and ensure timely delivery.",
                    Arrays.asList("Organizational Skills", "Time Management", "Communication", "Microsoft Office", "Team Collaboration"),
                    "Project Partners",
                    "Contract",
                    "2024-09-18",
                    "1-2 years of experience in project coordination, with strong organizational skills."),

            new JobPost(8,
                    "UX/UI Designer",
                    "Boston, MA",
                    3,
                    "We need a UX/UI Designer to create user-friendly interfaces and enhance user experience.",
                    Arrays.asList("Wireframing", "Prototyping", "User Research", "Adobe XD", "Figma"),
                    "Creative Agency",
                    "Full-time",
                    "2024-09-12",
                    "3+ years of experience in UX/UI design, with a portfolio showcasing user-centered designs."),

            new JobPost(9,
                    "Network Administrator",
                    "Phoenix, AZ",
                    5,
                    "Join our IT team as a Network Administrator to manage and support our network infrastructure.",
                    Arrays.asList("TCP/IP", "DNS", "Firewalls", "Network Security", "Troubleshooting"),
                    "Tech Services",
                    "Full-time",
                    "2024-09-14",
                    "5 years of experience in network administration, with strong troubleshooting skills."),

            new JobPost(10,
                    "Content Writer",
                    "Denver, CO",
                    3,
                    "We are seeking a talented Content Writer to produce high-quality written content for our website and blog.",
                    Arrays.asList("SEO Writing", "Research", "Copywriting", "Editing", "Creative Writing"),
                    "Content Creators",
                    "Freelance",
                    "2024-09-16",
                    "3+ years of experience in content writing, with a portfolio of published articles.")
    ));
    public List<JobPost> getJobs() {
        return jobs;
    }

    public JobPost addJobPost(JobPost job) {
        jobs.add(job);
        return job;
    }

    public JobPost getJob(int id) {

        for (JobPost job : jobs) {
            if (job.getId() == id) {
                return job;
            }
        }

        return null;
    }

    public void updateJob(JobPost post) {
        for (JobPost jobPost : jobs) {
            if (jobPost.getId() == post.getId()) {
                jobPost.setTitle(post.getTitle());
                jobPost.setSkills(post.getSkills());
                jobPost.setDatePosted(post.getDatePosted());
                jobPost.setCompany(post.getCompany());
                jobPost.setDescription(post.getDescription());
                jobPost.setEmploymentType(post.getEmploymentType());
                jobPost.setExperience(post.getExperience());
                jobPost.setExp(post.getExp());
                jobPost.setLocation(post.getLocation());
            }
        }
    }

    public String deleteJob(int id) {
        for (JobPost post : jobs) {
            if (post.getId() == id) {
                jobs.remove(post);
                return "Post deleted successfully!";
            }
        }

        return "Post not found!";
    }
}