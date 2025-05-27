// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.lang

@JsName("resources")
external object Resources {
    val invariant: ResourceMap
}

inline operator fun Resources.get(locale: String):ResourceMap? {
    return asDynamic()[locale]
}

inline fun Resources.getOrCreate(locale: String):ResourceMap {
    return get(locale) 
        ?: ResourceMap { set(locale, it) }
}

inline operator fun Resources.set(
    locale: String,
    value: ResourceMap
) {
    asDynamic()[locale] = value
}
