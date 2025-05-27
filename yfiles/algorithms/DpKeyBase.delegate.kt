// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.algorithms

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty
import yfiles.lang.YClass
import yfiles.lang.YObject

import yfiles.lang.findClass
import yfiles.lang.yclass

private fun <T:Any> KClass<T>.toValueType(): YClass<T> = 
    when (this) {
        Boolean::class -> Boolean.yclass
        String::class -> String.yclass
        
        Int::class -> Int.yclass
        
        Number::class,
        Float::class,
        Double::class -> Double.yclass
        
        else -> js.findClass() ?: YObject.yclass
    }.unsafeCast<YClass<T>>()

fun <T: DpKeyBase<*, V>, V: Any> dpKeyDelegate(
    createKey: (YClass<V>, YClass<*>, String) -> T,
    valueType: YClass<V>,
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, T> =
    NamedDelegate { name -> 
         createKey(valueType, declaringType, name)   
    }

fun <T: DpKeyBase<*, V>, V: Any> dpKeyDelegate(
    createKey: (YClass<V>, YClass<*>, String) -> T,
    valueClass: KClass<V>,
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, T> =
    dpKeyDelegate(createKey, valueClass.toValueType(), declaringType)

private class NamedDelegate<T: Any>(
    private val create: (String) -> T
): ReadOnlyProperty<Any?, T> {
    private lateinit var value: T

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): T {
        if (!::value.isInitialized) {
            value = create(property.name)
        }
        
        return value
    }
}
