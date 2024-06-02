def call(String name = 'World') {
    echo "Hello, ${name}!"
}

def farewell(String name = 'World') {
    echo "Goodbye, ${name}!"
}

def personalizedGreeting(String name = 'World', String message = 'Have a great day!') {
    echo "${name}, ${message}"
}

