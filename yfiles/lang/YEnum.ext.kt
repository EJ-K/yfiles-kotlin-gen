// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.lang

import js.array.ReadonlyArray

@Deprecated(message = "For code generation only", level = DeprecationLevel.HIDDEN)
inline fun <T: YEnum<T>> getEnumName(
    value: T, 
    type: EnumMetadata<T>
): String =
    YEnum.getName(type.yclass, value)

@Deprecated(message = "For code generation only", level = DeprecationLevel.HIDDEN)
inline fun <T: YEnum<T>> getEnumValues(
    type: EnumMetadata<T>
): Array<out T> =
    YEnum.getValues(type.yclass)
        
@Deprecated(message = "For code generation only", level = DeprecationLevel.HIDDEN)
inline fun <T: YEnum<T>> getEnumValueOf(
    type: EnumMetadata<T>,
    id: String
): T =
    YEnum.parse(type.yclass, id, true)       
