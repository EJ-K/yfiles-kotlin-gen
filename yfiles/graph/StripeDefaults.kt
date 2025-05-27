// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.styles.IStripeStyle

/**
 * A canonical implementation of the [IStripeDefaults] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDefaults">Online Documentation</a>
 * 
 * @constructor Default constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDefaults%23StripeDefaults-constructor-StripeDefaults">Online Documentation</a>
 */
external open class StripeDefaults  () : IStripeDefaults {

/**
 * Gets or sets the default insets for a stripe.
 * 
 * The default is `(0,0,0,0)`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDefaults%23insets">Online Documentation</a>
 */
final override var insets: Insets
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDefaults%23labels">Online Documentation</a>
 */
final override var labels: ILabelDefaults
/**
 * Gets or sets the default minimum stripe size.
 * @see [IStripe.minimumSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDefaults%23minimumSize">Online Documentation</a>
 */
final override var minimumSize: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDefaults%23shareStyleInstance">Online Documentation</a>
 */
final override var shareStyleInstance: Boolean
/**
 * Gets or sets the default stripe size.
 * @see [IStripe.size]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDefaults%23size">Online Documentation</a>
 */
final override var size: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDefaults%23style">Online Documentation</a>
 */
final override var style: IStripeStyle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDefaults%23StripeDefaults-method-getStyleInstance">Online Documentation</a>
 */
 override   fun getStyleInstance():IStripeStyle

companion object : ClassMetadata<StripeDefaults> {
}
}

inline fun StripeDefaults(
    block: StripeDefaults.() -> Unit
): StripeDefaults {
    return StripeDefaults()
        .apply(block)
}
