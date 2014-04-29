Placebo
=================

### Type Safety without the implementations

A full fledged SQL dsl in 0 lines:

```scala
// can't count how many times I've had to implement this one
def usersStartingWithT() = select.from("users")
                         .where((userName: String) => userName.startsWith("T"))
                         .offset(5).limit(10)
```

### No more compile errors! 

### Just use the code you wish you had!

