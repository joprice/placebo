Placebo
=================

### Type Safety without the implementations

1. Extend the `Placebo` trait 

2. Call any method you want, with any arguments. Even chain them!

3. Profit!

A full fledged SQL dsl in 0 lines:

```scala
case class User(name: String)

object select extends Placebo

// can't count how many times I've had to implement this one
def usersStartingWithT(): Seq[User] = select.from("users")
                         .where((userName: String) => userName.startsWith("T"))
                         .offset(5).limit(10)
```

### No more compile errors! 

### Just use the code you wish you had!

