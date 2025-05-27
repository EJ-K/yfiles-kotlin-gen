// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.lang

/**
 * Provides a method by which implementors can be compared to each other.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IComparable">Online Documentation</a>
 */
external interface IComparable<T : IComparable<T>> : YObject {
/**
 * Compares this object to the given object of the same type.
 * @param [other] The object to compare this to.
 * @return 
 *   - -1: this is less than `obj`
 *   - 0: this is equal to `obj`
 *   - 1: this is greater than `obj`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IComparable%23IComparable-method-compareTo">Online Documentation</a>
 */
  operator fun compareTo( other: T ):Int

companion object : InterfaceMetadata<IComparable<*>> {
}
}
