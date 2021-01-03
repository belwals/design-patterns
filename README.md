#Design-patters
Learning design pattern with the practical implementation

## Creational Design Pattern
### Factory Method Design pattern
Factory pattern gives flexibility to modify concrete implementation.
`DocumentFactory` is allowing us to loosely coupled the concrete class implementation of HtmlElement logic.


## Structural Design pattern
### Adapter pattern 
`WeatherWarnings` class deals with showing warning based on a temperature limit however implementation of this class supports only `Fahrenhiet` temperature scale.
So if in case of any City which has temperature scale other than `Fahrenhiet` class won't result correct warnings.
So to handle this problem we have a Adapter class which adapts `Celsius` temperature scale into `Fahrenhiet` so that warnings will be resulted correctly from `WeatherWarnings` implementation.

### Bridge pattern
To achieve loosely coupled design, from a complex interface hierarchical  logic, We have segregated concerns on design and logic in separate interface. 

### Composite pattern
Composite pattern allows treating individual and composite objects in same way.
BookCollection handles composite objects

### Decorator pattern
When we try to add extra features on the concrete implementation of a given class then we use decorator pattern by supplying object to new object 

### Facade design pattern
Hide complexity from client, facade hides logic from the client.

### Flyweight design pattern
Reuses the objects and overrides the extrinsic values 

### Proxy design pattern
Lazy initialization objects