package Models

class Food {
    var name: String? = null
    var ingredient: String? = null
    var preparation:String? = null

    constructor(name: String?, ingredient: String?, preparation: String?) {
        this.name = name
        this.ingredient = ingredient
        this.preparation = preparation
    }
}