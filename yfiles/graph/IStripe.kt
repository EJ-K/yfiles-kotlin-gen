// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.geometry.IRectangle
import yfiles.geometry.Insets
import yfiles.geometry.Rect
import yfiles.lang.InterfaceMetadata
import yfiles.styles.IStripeStyle

/**
 * This interface defines a child element of a table or a table element container
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe">Online Documentation</a>
 */
external interface IStripe : ILabelOwner {
/**
 * Gets the insets that are currently in effect for this stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23actualInsets">Online Documentation</a>
 */
final val actualInsets: Insets
/**
 * Returns the actual minimum size a stripe can acquire.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23actualMinSize">Online Documentation</a>
 */
final val actualMinSize: Double
/**
 * The current actual dimension of the stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23actualSize">Online Documentation</a>
 */
final val actualSize: Double
/**
 * Gets the direct children of `stripe` in a table hierarchy.
 * @see [IColumn.childColumns]
 * @see [IRow.childRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23childStripes">Online Documentation</a>
 */
final val childStripes: IEnumerable<IStripe>
/**
 * Returns a collection of all descendants of `stripe`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23descendants">Online Documentation</a>
 */
final val descendants: IEnumerable<IStripe>
/**
 * Gets the index of `stripe` in its [parentStripe] collection of [childStripes].
 * @see [IColumn.childColumns]
 * @see [IRow.childRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23index">Online Documentation</a>
 */
final val index: Int
/**
 * Gets the insets for this stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23insets">Online Documentation</a>
 */
val insets: Insets
/**
 * Checks whether `stripe` is the root item of a stripe hierarchy.
 * @see [root]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23isRoot">Online Documentation</a>
 */
final val isRoot: Boolean
/**
 * Gets a live view of the relative layout of the stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23layout">Online Documentation</a>
 */
val layout: IRectangle
/**
 * Returns a collection of all descendants of `stripe` that are leaves and therefore don't have any child stripes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23leaves">Online Documentation</a>
 */
final val leaves: IEnumerable<IStripe>
/**
 * Gets the minimal permissible value for [size].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23minimumSize">Online Documentation</a>
 */
val minimumSize: Double
/**
 * Gets the parent of `stripe` in a table hierarchy.
 * @see [IColumn.parentColumn]
 * @see [IRow.parentRow]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23parentStripe">Online Documentation</a>
 */
final val parentStripe: IStripe?
/**
 * Gets the root of the stripe hierarchy of `stripe` in a table hierarchy.
 * @see [ITable.rootColumn]
 * @see [ITable.rootRow]
 * @see [isRoot]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23root">Online Documentation</a>
 */
final val root: IStripe?
/**
 * Gets the current changeable dimension of the stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23size">Online Documentation</a>
 */
val size: Double
/**
 * Gets the style for this stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23style">Online Documentation</a>
 */
val style: IStripeStyle
/**
 * Gets the [ITable] instance where this stripe is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23table">Online Documentation</a>
 */
val table: ITable?
/**
 * Returns the layout of `stripe` in absolute coordinates.
 * @param [node] The node relative to which the stripe layout is calculated. This should be the same node where [table] for `stripe` is associated to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripe%23IStripe-defaultmethod-getAbsoluteBounds">Online Documentation</a>
 */
  final  fun getAbsoluteBounds( node: INode ):Rect = definedExternally

companion object : InterfaceMetadata<IStripe> {
}
}
