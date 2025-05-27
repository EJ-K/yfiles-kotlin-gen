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
import yfiles.layout.ILabelLayout

inline fun <reified T: Any> labelLayoutDpKey(): ReadOnlyProperty<Any?, ILabelLayoutDpKey<T>> = 
    labelLayoutDpKey(ILabelLayout.yclass)
    
inline fun <reified T: Any> labelLayoutDpKey(
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, ILabelLayoutDpKey<T>> = 
    dpKeyDelegate(::ILabelLayoutDpKey, T::class, declaringType)   
     
inline fun <T: YObject> labelLayoutDpKey(
    valueType: InterfaceMetadata<T>
): ReadOnlyProperty<Any?, ILabelLayoutDpKey<T>> = 
    labelLayoutDpKey(valueType, ILabelLayout.yclass)
    
inline fun <T: YObject> labelLayoutDpKey(
    valueType: InterfaceMetadata<T>,
    declaringType: YClass<out YObject>
): ReadOnlyProperty<Any?, ILabelLayoutDpKey<T>> = 
    dpKeyDelegate(::ILabelLayoutDpKey, valueType.yclass, declaringType)     
