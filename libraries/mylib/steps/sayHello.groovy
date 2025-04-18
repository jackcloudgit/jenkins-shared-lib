void call(Map args = [:]) {
    def name = args.get('name', 'User')
    println "👋 Hello from JTE, ${name}!"
}