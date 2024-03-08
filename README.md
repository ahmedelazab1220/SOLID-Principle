# SOLID Principle 🚀

In Java, SOLID principles are an object-oriented approach that are applied to software structure design.

# SOLID Acronym

- S : Single Responsibility Principle (SRP)

- O : Open closed Principle (OSP)

- L : Liskov substitution Principle (LSP)

- I : Interface Segregation Principle (ISP)

- D : Dependency Inversion Principle (DIP)

Now let’s deep dive into what all SOLID principle we have with Example

# SOLID design principles
### 1 - Single Responsibility Principle  (SRP)

This principle states that “a class should have only one reason to change” which means every class should have a single responsibility or single job or single purpose

The principle can be well understood with an example. Imagine there is a class called BankService which performs following operations.

- Withdraw
- Deposit
- Print Pass Book
- Get Loan Info
- Send OTP

Look at folder called Single-Responsibility to understand me.

Have you imagined the scenario? Here the class has multiple reasons to change.

For example look into getLoanInterestInfo() method , now bank service provide only info for Personal Loan , Home Loan and car loan let’s say in future bank people want to provide some other loan feature like gold loan and study loan then again you need to modify this class implementation right ?

similarly you can consider sendOTP() method , let’s assume BankService support send OTP medium as a email but in future they might want to introduced send OTP medium as Phone then again you need to change its implementation

it doesn’t follow single responsibility principle because this class has to many responsible or task to perform

To achieve the goal of the single responsibility principle, we should implement a separate class that performs a single functionality only.

For Example , we can move Print related code snippet to Printer Service.

```
public class PrinterService{
  public void printPassbook() {
    //update transaction info in passbook
  }
}  
```

Similarly Loan related job

```
public class LoanService{
public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
        }
        if (loanType.equals("personalLoan")) {
            //do some job
        }
        if (loanType.equals("car")) {
            //do some job
        }
    }
}
```
Now if you observe Each class have single Responsibility to perform their task.

### 2- Open closed Principle (OSP)

This principle states that “software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification” which means you should be able to extend a class behavior, without modifying it.

let’s understand this principle with an example .let’s consider the same Notification service which we just created.

```
public class OTPService{
public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}
```

Here as discussed earlier if you want to introduced send OTP via mobile Phone or WhatsApp number then you need to modify source code in Notification Service right?

Here What OCP says , It open for Extension but close for modification hence its not recommended to modify Notification Service for each OTP Feature , it will violate OCP

So to overcome this you need to design your code in such a way that everyone can reuse your feature by just extending it and if they need any customization they can extend it and add their feature on top of it like a abstraction .

You can design something like below.

```
public interface NotificationService{
   public void sendOTP(String medium);
}
```

EmailNotification implantation

```
public class EmailNotification implements NotificationService{
    public void sendOTP(String medium){
      // write Logic using JavaEmail api 
    }
}
```
Mobile Notification implementation

```
public class MobileNotification implements NotificationService{
    public void sendOTP(String medium){
       // write Logic using Twilio SMS API 
    }
}
```

similarly you can add implementation for WhatsApp notification service

```
public class WhatsAppNotification implements NotificationService{
    public void sendOTP(String medium){
       // write Logic using whatsapp API
    }
}
```

Liskov substitution Principle (LSP)

This principle states that “Derived or child classes must be substitutable for their base or parent classes”. In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behavior of the program.

This principle is bit tricky and interesting all it designed based on Inheritance concepts ,so let’s better understand this with an example

Let’s consider I have an abstract class called SocialMedia , who supported all social media activity for user to entertain them like below.

```
public interface SocialMedia {
    
    public void chatWithFriend();
    
    public void publishPost(Object post);
    
    public void sendPhotosAndVideos();
    
    public void groupVideoCall(String... users);
}
```

Social media can have multiple implantation or can have multiple child like Facebook, WhatsApp ,instagram and Twitter etc..

now let’s assume Facebook want to use this features or functionality.

public class Facebook extends SocialMedia {

    public void chatWithFriend() {
        //logic  
    }

    public void publishPost(Object post) {
        //logic  
    }

    public void sendPhotosAndVideos() {
        //logic  
    }

    public void groupVideoCall(String... users) {
        //logic  
    }
}

Now let’s discuss WhatsApp class

public class WhatsApp extends SocialMedia {
    public void chatWithFriend() {
        //logic
    }

    public void publishPost(Object post) {
      //Not Applicable
    }

    public void sendPhotosAndVideos() {
      //logic
    }

    public void groupVideoCall(String... users) {
        //logic
    }
}
due to publishPost() method whatsapp child is not substitute of parents SocialMedia

because whatsapp doesn’t support upload photos and videos for friend it’s just a chatting application so it doesn’t follow LSP

Similarly instagram doesn’t support groupVideoCall() feature so we say instagram child is not substitute of parents SocialMedia

How to overcome this issue so that my code can follow LSP

solution

create a Social media interface

```
public interface SocialMedia {  
   public void chatWithFriend();
   public void sendPhotosAndVideos()
}
```

```
public interface SocialPostAndMediaManager { 
    public void publishPost(Object post);
}
```

