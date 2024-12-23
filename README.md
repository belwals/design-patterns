#Design-patters
Learning design pattern with the practical implementation

## Creational Design Pattern
  1. ### Factory Method Design pattern
     Factory Method pattern gives flexibility to modify concrete implementation.
     `DocumentFactory` is allowing us to loosely coupled the concrete class implementation of HtmlElement logic.
  2. ### Builder pattern
     Provides control of the object creation, hides the complexity of assembly
  3. ### Singleton Design pattern
     Allows only single object creation for a particular class.
     `Singleton` class is being used to design the pattern
  4. ### Prototype Design pattern
     Prototype allows us to hide the complexity of making new instances from the client.
     The concept is to copy an existing object rather than creating a new instance from scratch of the object.
     To implement prototype a class should implement `cloneable` interface.
     `Rabbit` and `Person` class implements the prototype pattern

## Structural Design pattern
  1. ### Adapter pattern
     `WeatherWarnings` class deals with showing warning based on a temperature limit however implementation of this class supports only `Fahrenhiet` temperature scale.
    So if in case of any City which has temperature scale other than `Fahrenhiet` class won't result correct warnings.
    So to handle this problem we have a Adapter class which adapts `Celsius` temperature scale into `Fahrenhiet` so that warnings will be resulted correctly from `WeatherWarnings` implementation.
  2. ### Bridge pattern
     To achieve loosely coupled design, from a complex interface hierarchical  logic, We have segregated concerns on design and logic in separate interface. 
  3. ### Composite pattern
      Composite pattern allows treating individual and composite objects in same way.
      BookCollection handles composite objects
  4. ### Decorator pattern
     When we try to add extra features on the concrete implementation of a given class then we use decorator pattern by supplying object to new object
  5. ### Facade design pattern
     Hide complexity from client, facade hides logic from the client.
  6. ### Flyweight design pattern
      Reuses the objects and overrides the extrinsic values
  7. ### Proxy design pattern
     Lazy initialization objects
















