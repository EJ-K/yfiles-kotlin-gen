// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration constant for use in [Matrix] operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MatrixOrder">Online Documentation</a>
 */
external sealed class MatrixOrder: YEnum<MatrixOrder> {
   companion object: EnumMetadata<MatrixOrder> {
       /**
 * Constant that defines a prepend operation for matrix multiplications.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MatrixOrder%23PREPEND">Online Documentation</a>
 */
val PREPEND: MatrixOrder

/**
 * Constant that defines an append operation for matrix multiplications.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MatrixOrder%23APPEND">Online Documentation</a>
 */
val APPEND: MatrixOrder
   }
}
