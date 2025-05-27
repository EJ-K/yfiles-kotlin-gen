// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.lang

import js.array.ReadonlyArray

/**
 * Provides static helper methods for enums.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Enum">Online Documentation</a>
 */
@JsName("Enum")
external interface YEnum<T : YEnum<T>>  {

companion object  {
/**
 * Returns the name of an enum constant.
 * @param [type] The type of the enum.
 * @param [value] The numeric value of the constant.
 * @return The name of the constant.
 * @throws Error If the given type is no enum or if the enum contains no constant of the given numeric value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Enum%23Enum-method-getName">Online Documentation</a>
 */
 final   fun <T : YEnum<T>>getName( type: YClass<T> ,
 value: YEnum<T> ):String
/**
 * Returns a list of all names.
 * @param [type] The type of the enum.
 * @return A list of the names of all constants of the given enum type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Enum%23Enum-method-getValueNames">Online Documentation</a>
 */
 final   fun <T : YEnum<T>>getValueNames( type: YClass<T> ):ReadonlyArray<String>
/**
 * Returns a list of all numeric values.
 * @param [type] The type of the enum.
 * @return A list of all numeric values of all constants of the given enum type.
 * @throws Error If the given type is no enum.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Enum%23Enum-method-getValues">Online Documentation</a>
 */
 final   fun <T : YEnum<T>>getValues( type: YClass<T> ):ReadonlyArray<T>
/**
 * Returns the numeric value of the enum constant with the given name.
 * @param [type] The type of the enum.
 * @param [name] The name of the enum constant.
 * @param [ignoreCase] If `true`, name-matching is case-insensitive.
 * @return The numeric value of the constant with the given name.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Enum%23Enum-method-parse">Online Documentation</a>
 */
 final   fun <T : YEnum<T>>parse( type: YClass<T> ,
 name: String ,
 ignoreCase: Boolean  = definedExternally):T
}
}
