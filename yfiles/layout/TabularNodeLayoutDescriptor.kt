// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class is used by [TabularLayout] to provide placement details for nodes during the layout process.
 * @see [TabularLayout.NODE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see [TabularLayout.defaultNodeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutNodeLayoutDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a [TabularNodeLayoutDescriptor] with the default values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutNodeLayoutDescriptor%23TabularNodeLayoutDescriptor-constructor-TabularNodeLayoutDescriptor">Online Documentation</a>
 */
@JsName("TabularLayoutNodeLayoutDescriptor")
external open class TabularNodeLayoutDescriptor  () : YObject {

/**
 * Gets or sets the horizontal alignment of the node within its column.
 * 
 * Default value - `0.5`. The node is center-aligned in its column.
 * @throws ArgumentError if the given value is not within interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutNodeLayoutDescriptor%23horizontalAlignment">Online Documentation</a>
 */
open var horizontalAlignment: Double
/**
 * Gets or sets the vertical alignment of the node within its row.
 * 
 * Default value - `0.5`. The node is center-aligned in its row.
 * @throws ArgumentError if the given value is not within interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutNodeLayoutDescriptor%23verticalAlignment">Online Documentation</a>
 */
open var verticalAlignment: Double
/**
 * Creates a copy of this descriptor instance.
 * @return a copy of this descriptor instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutNodeLayoutDescriptor%23TabularNodeLayoutDescriptor-method-createCopy">Online Documentation</a>
 */
 open   fun createCopy():TabularNodeLayoutDescriptor

companion object : ClassMetadata<TabularNodeLayoutDescriptor> {
}
}

inline fun TabularNodeLayoutDescriptor(
    block: TabularNodeLayoutDescriptor.() -> Unit
): TabularNodeLayoutDescriptor {
    return TabularNodeLayoutDescriptor()
        .apply(block)
}
