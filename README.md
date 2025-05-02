Video Content Management System
-----------------------------------
Simple Prototype of Video Content Management System with basic thymeleaf WebUI and Java 17 backend Springboot application.

Guidelines to run
--------------------
1. Extract the folder
2. Open terminal/command prompt
3. run "mvn clean install" (make sure you have maven installed)
4. run "mvn spring-boot:run"
5. Open browser and navigate to "http://localhost:8080/web"
6. Fill in any details and submit. It would either redirect you to success or error page depending on input.

Not Included
----------------
1. Test cases
2. React or any other dynamic frontend
3. Security related code
4. Database saving / CRUD operations

Disclaimer
----------------
Does not post to actual social platforms, shows only how it will be handled and how the structure will look like.

Requirements
-----------------------
Functional:
1. Select multiple platforms (Twitter/X, Instagram, Bluesky)
2. Post immediately or schedule
3. Include message, optional image/video
4. Post from within VCMS interface (web integration)

Non-Functional:
1. Scalable, cloud-ready architecture
2. Secure API key/token handling (not included in code)
3. Extensible for future platforms
4. Continuous Deployment pipeline


CICD artifacts, strategy
----------------------
- GitHub Actions or Jenkins or any other Pipeline can be used. 
- A sample yaml file(deploy.yml) is included.

Deployment Strategy
-----------------------
- It can be containerised in docker and run on Kubernetes(k8s).
- A Sample dockerfile included.