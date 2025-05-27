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

inline fun <reified T: Any> nodeDpKey(): ReadOnlyProperty<Any?, NodeDpKey<T>> = 
    nodeDpKey(Node.yclass)
    
inline fun <reified T: Any> nodeDpKey(
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, NodeDpKey<T>> = 
    dpKeyDelegate(::NodeDpKey, T::class, declaringType)   
     
inline fun <T: YObject> nodeDpKey(
    valueType: InterfaceMetadata<T>
): ReadOnlyProperty<Any?, NodeDpKey<T>> = 
    nodeDpKey(valueType, Node.yclass)
    
inline fun <T: YObject> nodeDpKey(
    valueType: InterfaceMetadata<T>,
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, NodeDpKey<T>> = 
    dpKeyDelegate(::NodeDpKey, valueType.yclass, declaringType)     
