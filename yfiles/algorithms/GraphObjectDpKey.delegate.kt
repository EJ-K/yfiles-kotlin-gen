// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.algorithms

import kotlin.properties.ReadOnlyProperty
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

inline fun <reified T: Any> graphObjectDpKey(): ReadOnlyProperty<Any?, GraphObjectDpKey<T>> = 
    graphObjectDpKey(GraphObject.yclass)
    
inline fun <reified T: Any> graphObjectDpKey(
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, GraphObjectDpKey<T>> = 
    dpKeyDelegate(::GraphObjectDpKey, T::class, declaringType)   
     
inline fun <T: YObject> graphObjectDpKey(
    valueType: InterfaceMetadata<T>
): ReadOnlyProperty<Any?, GraphObjectDpKey<T>> = 
    graphObjectDpKey(valueType, GraphObject.yclass)
    
inline fun <T: YObject> graphObjectDpKey(
    valueType: InterfaceMetadata<T>,
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, GraphObjectDpKey<T>> = 
    dpKeyDelegate(::GraphObjectDpKey, valueType.yclass, declaringType)     
