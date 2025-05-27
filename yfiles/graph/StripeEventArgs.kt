// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.ItemEventArgs
import yfiles.lang.ClassMetadata

/**
 * A specialized subclass of the [ItemEventArgs] class that is bound to the [IStripe] type and carries additional [owner][IStripe] information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [StripeEventArgs] class.
 * @param [stripe] The stripe to assign to the [ItemEventArgs.item] property.
 * @param [parentStripe] The previous parent of the stripe.
 * @param [table] The table the stripe belonged to previously.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeEventArgs%23StripeEventArgs-constructor-StripeEventArgs">Online Documentation</a>
 * 
 * @property parentStripe
 * Gets the parent of the stripe that owned the stripe before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeEventArgs%23parentStripe">Online Documentation</a>
 * 
 * @property table
 * Gets the table that owned the stripe before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeEventArgs%23table">Online Documentation</a>
 */
external  class StripeEventArgs  (
 stripe: IStripe ,
final val parentStripe: IStripe,
final val table: ITable?) : ItemEventArgs<IStripe> {

companion object : ClassMetadata<StripeEventArgs> {
}
}
