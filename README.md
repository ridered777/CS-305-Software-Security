# CS-305-Software-Security

**Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?**

Artemis Financial was a client that had needs to secure an application within the financial space. Ultimately, they required that we assess current issues, refactor the application to showcase those issues, address those issues, and add encryption to their application.

**What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?**

In this project, I feel I excelled at implementing the encryption to their ServerController in a concise and easy to understand manner, as well as making sure it had the proper error-handling it needed. This security will also measurably save the well-being of the company in the coming future, knowing that they’ve secured against the inevitable attacks that will be coming their way once this is deployed out to the public.

**What about the process of working through the vulnerability assessment did you find challenging or helpful?**

The most difficult part of working through a vulnerability  assessment initially was getting all the dependencies and version to work well together. Maven (and ANT) are still things that seem to work half via logic and half via magic, so trial and error was needed within the Maven config to get everything working well. Luckily, those hurdles were encountered early in the semester and I was able to take the lessons learned from that and put them towards the later projects to save time.

**How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques?**
The approach here was to add encryption to the existing application to increase a layer of security. The 2nd thing to add was to increase the security of the SSL connection (implemented  via Tomcat) by enabling the use of the provided keystore items. In the future when not specifically told where to add layers of security I will use the OWASP and other tools to assess the vulnerabilities and implement mitigation techniques to best serve the application.

**How did you ensure the code and software application were functional and secure? After refactoring code, how did you check to see whether you introduced new vulnerabilities?**

Several things were done following the changes to the code to ensure it's secure and functional. First, it was all compiled again both as a Maven project and as the application requires to run/control the server. Those runs were monitored  for any odd debug messages or compilation errors. Next, the Maven build was leveraged to re-run the Dependency-Check tool from OWASP to ensure no new vulnerabilities were introduced (they were not).

**What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks?**

Obviously, the open-source OWASP tool will prove to be invaluable in the future for any assignments or tasks like this. I didn't know it existed and not only is it very powerful, the experience gained with setting it up and configuring it will be very useful should I need to make use of it in the future.

**Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer?**

There are several things I would be able to showcase. The first of is implementing the messageDigester and encryption on the ServerController, which has many real-world applications and uses. The second is my use and knowledge of the OWASP tool, which could even be used as a great asset to companies and projects that aren't yet aware of its' existence as I was prior to this class.
