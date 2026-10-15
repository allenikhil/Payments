package org.example;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;

public class ResumeDocxGenerator {

    private static final String FONT_FAMILY = "Calibri";
    private static final String COLOR_PRIMARY = "003366";
    private static final String COLOR_TEXT = "333333";

    public static void main(String[] args) {
        try (XWPFDocument document = new XWPFDocument();
             FileOutputStream out = new FileOutputStream("Alle_Nikhil_Senior_Java_Backend_Engineer.docx")) {

            // Header - Name
            XWPFParagraph namePara = document.createParagraph();
            namePara.setAlignment(ParagraphAlignment.CENTER);
            namePara.setSpacingAfter(40);
            XWPFRun nameRun = namePara.createRun();
            nameRun.setText("ALLE NIKHIL");
            nameRun.setBold(true);
            nameRun.setFontSize(18);
            nameRun.setFontFamily(FONT_FAMILY);

            // Header - Title
            XWPFParagraph titlePara = document.createParagraph();
            titlePara.setAlignment(ParagraphAlignment.CENTER);
            titlePara.setSpacingAfter(80);
            XWPFRun titleRun = titlePara.createRun();
            titleRun.setText("Senior Java Backend Engineer | Spring Boot | Microservices | Kafka | AWS Serverless");
            titleRun.setBold(true);
            titleRun.setFontSize(12);
            titleRun.setFontFamily(FONT_FAMILY);

            // Header - Contact Details
            XWPFParagraph contactPara = document.createParagraph();
            contactPara.setAlignment(ParagraphAlignment.CENTER);
            contactPara.setSpacingAfter(200);
            XWPFRun contactRun = contactPara.createRun();
            contactRun.setText("Hyderabad, India  |  +91 9440683072  |  allenikhil70@gmail.com");
            contactRun.addBreak();
            contactRun.setText("LinkedIn: linkedin.com/in/nikhil-alle-3490a9123  |  GitHub: github.com/allenikhil");
            contactRun.setFontSize(9);
            contactRun.setFontFamily(FONT_FAMILY);
            contactRun.setColor(COLOR_TEXT);

            // Professional Summary
            addSectionHeading(document, "PROFESSIONAL SUMMARY");
            XWPFParagraph summaryPara = document.createParagraph();
            summaryPara.setSpacingAfter(140);
            XWPFRun summaryRun = summaryPara.createRun();
            summaryRun.setText("Senior Java Backend Engineer with 7.4 years of experience building scalable, distributed backend systems using Java 17, Spring Boot, Kafka, and AWS Serverless. Proven track record of improving system performance by 30%, reducing cloud costs by 25%, and operating high-volume data pipelines processing millions of records. Strong in event-driven microservices, fault-tolerant messaging, and end-to-end production ownership.");
            summaryRun.setFontSize(10);
            summaryRun.setFontFamily(FONT_FAMILY);
            summaryRun.setColor(COLOR_TEXT);

            // Core Skills
            addSectionHeading(document, "CORE SKILLS");
            addSkillItem(document, "Backend", "Java 17, Spring Boot, REST APIs, Hibernate, JPA");
            addSkillItem(document, "Architecture & Patterns", "Microservices, Event-Driven Architecture, Design Patterns");
            addSkillItem(document, "Messaging", "Apache Kafka");
            addSkillItem(document, "Cloud & Serverless", "AWS Lambda, S3, IAM, VPC, CloudFormation");
            addSkillItem(document, "Databases", "PostgreSQL, MySQL, Oracle DB");
            addSkillItem(document, "DevOps & Tools", "CI/CD, Git, Production Support");
            addSkillItem(document, "Security & Auth", "Spring Security, JWT, Role-Based Access Control, OAuth2 basics");

            // Professional Experience
            addSectionHeading(document, "PROFESSIONAL EXPERIENCE");

            addJobExperience(document,
                    "Guru Gowri Krupa Technologies Pvt Ltd",
                    "Senior Java Backend Engineer",
                    "Apr 2022 – Aug 2026",
                    new String[]{
                            "Designed and developed event-driven microservices using Java 17 and AWS Lambda, processing high-volume data through Kafka-based asynchronous communication.",
                            "Improved Kafka consumer throughput by 30% by optimizing consumer group configurations and parallel processing.",
                            "Implemented retry mechanisms and dead-letter queues to ensure fault-tolerant message processing.",
                            "Migrated legacy workflows to AWS Lambda, reducing cloud infrastructure costs by 25%.",
                            "Optimized PostgreSQL queries and indexing, improving system response times by 35%.",
                            "Operated and monitored high-volume cloud data pipelines processing millions of records under strict SLAs.",
                            "Built and maintained automated CI/CD pipelines using GitHub Actions for build and zero-downtime deployment.",
                            "Acted as backend owner for multiple core services and mentored junior software engineers."
                    });

            addJobExperience(document,
                    "Ivy Comptech",
                    "Software Engineer",
                    "Nov 2021 – Apr 2022",
                    new String[]{
                            "Developed high-throughput RESTful APIs for mission-critical financial transaction systems using Java and Spring Boot.",
                            "Integrated backend services with Oracle DB ensuring strict ACID compliance and transaction integrity.",
                            "Provided active tier-3 production support and resolved critical backend production incidents."
                    });

            addJobExperience(document,
                    "Vupadhi Techno Services Pvt Ltd",
                    "Full Stack Developer",
                    "Apr 2019 – Nov 2021",
                    new String[]{
                            "Designed and implemented 100+ Spring MVC endpoints using Java for nationwide government e-Tender platforms.",
                            "Built and maintained JPA domain models supporting large-scale, concurrent bidding workflows.",
                            "Resolved critical production bugs within 2 hours, minimizing system downtime.",
                            "Maintained high system availability for platforms used concurrently by thousands of bidders across India."
                    });

            // Education
            addSectionHeading(document, "EDUCATION");
            XWPFParagraph eduPara = document.createParagraph();
            eduPara.setSpacingAfter(40);
            XWPFRun eduTitle = eduPara.createRun();
            eduTitle.setText("B.Tech in Computer Science & Engineering  |  2014 – 2018");
            eduTitle.setBold(true);
            eduTitle.setFontSize(10);
            eduTitle.setFontFamily(FONT_FAMILY);

            XWPFParagraph collegePara = document.createParagraph();
            collegePara.setSpacingAfter(100);
            XWPFRun collegeRun = collegePara.createRun();
            collegeRun.setText("Nalla Malla Reddy Engineering College — Hyderabad, India");
            collegeRun.setFontSize(9.5);
            collegeRun.setFontFamily(FONT_FAMILY);
            collegeRun.setColor(COLOR_TEXT);

            document.write(out);
            System.out.println("Generated Alle_Nikhil_Senior_Java_Backend_Engineer.docx successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addSectionHeading(XWPFDocument document, String title) {
        XWPFParagraph headingPara = document.createParagraph();
        headingPara.setSpacingBefore(160);
        headingPara.setSpacingAfter(60);
        XWPFRun run = headingPara.createRun();
        run.setText(title);
        run.setBold(true);
        run.setFontSize(11);
        run.setFontFamily(FONT_FAMILY);
        run.setColor(COLOR_PRIMARY);
    }

    private static void addSkillItem(XWPFDocument document, String category, String details) {
        XWPFParagraph p = document.createParagraph();
        p.setSpacingAfter(20);
        XWPFRun bulletRun = p.createRun();
        bulletRun.setText("• " + category + ": ");
        bulletRun.setBold(true);
        bulletRun.setFontSize(9.5);
        bulletRun.setFontFamily(FONT_FAMILY);

        XWPFRun descRun = p.createRun();
        descRun.setText(details);
        descRun.setFontSize(9.5);
        descRun.setFontFamily(FONT_FAMILY);
        descRun.setColor(COLOR_TEXT);
    }

    private static void addJobExperience(XWPFDocument document, String company, String role, String duration, String[] bullets) {
        XWPFParagraph headerPara = document.createParagraph();
        headerPara.setSpacingBefore(100);
        headerPara.setSpacingAfter(30);

        XWPFRun roleRun = headerPara.createRun();
        roleRun.setText(role + " — " + company);
        roleRun.setBold(true);
        roleRun.setFontSize(10);
        roleRun.setFontFamily(FONT_FAMILY);

        XWPFRun dateRun = headerPara.createRun();
        dateRun.setText("  |  " + duration);
        dateRun.setItalic(true);
        dateRun.setFontSize(9.5);
        dateRun.setFontFamily(FONT_FAMILY);

        for (String bullet : bullets) {
            XWPFParagraph bulletPara = document.createParagraph();
            bulletPara.setSpacingAfter(20);
            XWPFRun bulletRun = bulletPara.createRun();
            bulletRun.setText("• " + bullet);
            bulletRun.setFontSize(9.5);
            bulletRun.setFontFamily(FONT_FAMILY);
            bulletRun.setColor(COLOR_TEXT);
        }
    }
}
