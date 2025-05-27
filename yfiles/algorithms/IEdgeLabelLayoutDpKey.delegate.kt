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
import yfiles.layout.IEdgeLabelLayout

inline fun <reified T: Any> edgeLabelLayoutDpKey(): ReadOnlyProperty<Any?, IEdgeLabelLayoutDpKey<T>> = 
    edgeLabelLayoutDpKey(IEdgeLabelLayout.yclass)
    
inline fun <reified T: Any> edgeLabelLayoutDpKey(
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, IEdgeLabelLayoutDpKey<T>> = 
    dpKeyDelegate(::IEdgeLabelLayoutDpKey, T::class, declaringType)   
     
inline fun <T: YObject> edgeLabelLayoutDpKey(
    valueType: InterfaceMetadata<T>
): ReadOnlyProperty<Any?, IEdgeLabelLayoutDpKey<T>> = 
    edgeLabelLayoutDpKey(valueType, IEdgeLabelLayout.yclass)
    
inline fun <T: YObject> edgeLabelLayoutDpKey(
    valueType: InterfaceMetadata<T>,
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, IEdgeLabelLayoutDpKey<T>> = 
    dpKeyDelegate(::IEdgeLabelLayoutDpKey, valueType.yclass, declaringType)     
