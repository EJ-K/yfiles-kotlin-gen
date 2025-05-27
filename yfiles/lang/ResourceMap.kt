// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.lang

@JsName("Object")
external class ResourceMap
private constructor()

inline fun ResourceMap(block: (ResourceMap) -> Unit):ResourceMap { 
    val map: ResourceMap = js("({})")
    return map.also(block)
}

inline operator fun <T: Any> ResourceMap.get(key: ResourceKey<T>):T? {
    return asDynamic()[key]
}

inline fun <T: Any> ResourceMap.getValue(key: ResourceKey<T>):T? {
    return requireNotNull(get(key))
}

inline operator fun <T: Any> ResourceMap.set(
   key: ResourceKey<T>, 
   value: T
) {
    asDynamic()[key] = value
}
