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

inline fun <reified T: Any> graphDpKey(): ReadOnlyProperty<Any?, GraphDpKey<T>> = 
    graphDpKey(Graph.yclass)
    
inline fun <reified T: Any> graphDpKey(
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, GraphDpKey<T>> = 
    dpKeyDelegate(::GraphDpKey, T::class, declaringType)   
     
inline fun <T: YObject> graphDpKey(
    valueType: InterfaceMetadata<T>
): ReadOnlyProperty<Any?, GraphDpKey<T>> = 
    graphDpKey(valueType, Graph.yclass)
    
inline fun <T: YObject> graphDpKey(
    valueType: InterfaceMetadata<T>,
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, GraphDpKey<T>> = 
    dpKeyDelegate(::GraphDpKey, valueType.yclass, declaringType)     
