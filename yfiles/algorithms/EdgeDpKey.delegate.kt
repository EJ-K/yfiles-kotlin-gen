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

inline fun <reified T: Any> edgeDpKey(): ReadOnlyProperty<Any?, EdgeDpKey<T>> = 
    edgeDpKey(Edge.yclass)
    
inline fun <reified T: Any> edgeDpKey(
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, EdgeDpKey<T>> = 
    dpKeyDelegate(::EdgeDpKey, T::class, declaringType)   
     
inline fun <T: YObject> edgeDpKey(
    valueType: InterfaceMetadata<T>
): ReadOnlyProperty<Any?, EdgeDpKey<T>> = 
    edgeDpKey(valueType, Edge.yclass)
    
inline fun <T: YObject> edgeDpKey(
    valueType: InterfaceMetadata<T>,
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, EdgeDpKey<T>> = 
    dpKeyDelegate(::EdgeDpKey, valueType.yclass, declaringType)     
