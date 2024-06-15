def call(Map config = [:]) {
    sh "echo Hello World, today is ${config.dayOfWeek} and your name is ${config.name} "
}