# SpringBoot_Game
Spring Boot : A java based framework that enables user to automate the process of using depedencies and choosing web,reactive web and may more

Dependency injection : Dependency injection uses loose coupling to avoid hard coding of things and thus providing inclusion of different objects in our code easily
                       Also you need to test a particular code with different items so at that time injection helps a lot (like testing a hard drive with more than one laptops)
                       
                       Eg : if you are using one class into another you will have to create an object of that class in the current class but spring boot creates all objects automatically once you have an 
                            @Component annotation on top of class so no need to use new keyword
                            So using @Autowired on top of the object declaration it connnects these two classes and hence youe can use any object of class in current class	
                            
Model and View Class : the model claas helps to store the data from our site and share it with html file in application
                       View class helps in setting the view like html page,etc
