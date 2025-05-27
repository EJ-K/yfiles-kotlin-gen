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
import yfiles.layout.INodeLabelLayout

inline fun <reified T: Any> nodeLabelLayoutDpKey(): ReadOnlyProperty<Any?, INodeLabelLayoutDpKey<T>> = 
    nodeLabelLayoutDpKey(INodeLabelLayout.yclass)
    
inline fun <reified T: Any> nodeLabelLayoutDpKey(
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, INodeLabelLayoutDpKey<T>> = 
    dpKeyDelegate(::INodeLabelLayoutDpKey, T::class, declaringType)   
     
inline fun <T: YObject> nodeLabelLayoutDpKey(
    valueType: InterfaceMetadata<T>
): ReadOnlyProperty<Any?, INodeLabelLayoutDpKey<T>> = 
    nodeLabelLayoutDpKey(valueType, INodeLabelLayout.yclass)
    
inline fun <T: YObject> nodeLabelLayoutDpKey(
    valueType: InterfaceMetadata<T>,
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, INodeLabelLayoutDpKey<T>> = 
    dpKeyDelegate(::INodeLabelLayoutDpKey, valueType.yclass, declaringType)     
