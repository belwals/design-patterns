#Design-patters
Learning design pattern with the practical implementation

## Adapter pattern 
`WeatherWarnings` class deals with showing warning based on a temperature limit however implementation of this class supports only `Fahrenhiet` temperature scale.
So if in case of any City which has temperature scale other than `Fahrenhiet` class won't result correct warnings.
So to handle this problem we have a Adapter class which adapts `Celsius` temperature scale into `Fahrenhiet` so that warnings will be resulted correctly from `WeatherWarnings` implementation.

## Bridge pattern
To achieve loosely coupled design, from a complex interface hierarchical  logic, We have segregated concerns on design and logic in separate interface. 