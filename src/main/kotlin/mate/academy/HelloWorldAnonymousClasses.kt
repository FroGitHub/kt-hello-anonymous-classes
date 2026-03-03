package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {

        val engGreeting = object: HelloWorldGreeting {
            override fun greet(): String = "Hello world"
            override fun greetSomeone(someone: String): String = "Hello $someone"
        }
        val espGreeting = object: HelloWorldGreeting {
            override fun greet(): String = "Hola, mundo"
            override fun greetSomeone(someone: String): String = "Hola, $someone"
        }
        val frGreeting = object: HelloWorldGreeting {
            override fun greet(): String = "Salut tout le monde"
            override fun greetSomeone(someone: String): String = "Salut $someone"
        }

        val listOfGreeting = listOf(engGreeting, frGreeting, espGreeting)
        val returnsList: MutableList<String> = mutableListOf()

        listOfGreeting.forEach { returnsList.add(it.greet()) }

        for (name in names) {
            listOfGreeting.forEach { returnsList.add(it.greetSomeone(name)) }
        }
        return returnsList
    }
}
