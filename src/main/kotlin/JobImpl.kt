package model

import kotlin.reflect.KProperty

class JobImpl : Job {
    override var cost: Int
        get() {
            return field
        }
        set(value: Int) {
            field = cost
        }
    override var id: Int
        get() {
            return field
        }
        set(value: Int) {
            field = id
        }
    constructor(_cost: Int, _id: Int) {
        cost = _cost
        id = _id
    }

}