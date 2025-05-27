// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.YFlags

/**
 * An enumeration for use in various properties that can take a bitwise combination of stripe types
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeTypes">Online Documentation</a>
 */
external class StripeTypes 
    private constructor(): YFlags<StripeTypes> {
    companion object {
    /**
 * Constant for no item type.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeTypes%23NONE">Online Documentation</a>
 */
val NONE: StripeTypes
/**
 * Constant for rows.
 * 
 * Value - `1`
 * @see [ROW]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeTypes%23ROW">Online Documentation</a>
 */
val ROW: StripeTypes
/**
 * Constant for columns.
 * 
 * Value - `2`
 * @see [COLUMN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeTypes%23COLUMN">Online Documentation</a>
 */
val COLUMN: StripeTypes
/**
 * Constant for all item types.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeTypes%23ALL">Online Documentation</a>
 */
val ALL: StripeTypes

    }
}
