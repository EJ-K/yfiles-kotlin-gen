// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Provides a method to compare two objects of the same type.
 * @param [T] The type of the objects to compare.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IComparer">Online Documentation</a>
 */
external interface IComparer<T> : YObject {
/**
 * Compares two objects of type T.
 * @param [x] The first object.
 * @param [y] The second object.
 * @return 
 *   - -1: `x` is less than `y`
 *   - 0: `x` is equal to `y`
 *   - 1: `x` is greater than `y`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IComparer%23IComparer-method-compare">Online Documentation</a>
 */
   fun compare( x: T ,
 y: T ):Int

companion object : InterfaceMetadata<IComparer<*>> {

/**
 * Creates an implementation of the interface [IComparer] by using the given function as implementation for its [compare] method.
 * @param [compare] A function for [IComparer]'s single abstract method [compare].
 * @return An instance of the [IComparer] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IComparer%23IComparer-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun <T> invoke(
                compare: (
            x: T,
y: T
            ) -> Int 
            ):IComparer<T>
}
}
