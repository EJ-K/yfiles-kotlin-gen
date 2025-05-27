// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * The [MultiParentDescriptor] provides style information for multi-parent structures.
 * @see [TreeLayout.MULTI_PARENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new [MultiParentDescriptor] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor%23MultiParentDescriptor-constructor-MultiParentDescriptor">Online Documentation</a>
 */
external open class MultiParentDescriptor  () : YObject {

/**
 * Gets or sets the routing style for edges that connect to nodes which constitute a multi-parent structure.
 * 
 * Default value - [MultiParentRoutingStyle.ORTHOGONAL]
 * @throws ArgumentError if the given routing style is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor%23edgeStyle">Online Documentation</a>
 */
open var edgeStyle: MultiParentRoutingStyle
/**
 * Gets or sets the minimum distance between the nodes of a multi-parent structure and the bus connecting these nodes.
 * 
 * Default value - `10`
 * @throws ArgumentError if the given bus distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor%23minimumBusDistance">Online Documentation</a>
 */
open var minimumBusDistance: Double
/**
 * Gets or sets the minimum distance between two nodes belonging to the same multi-parent structure.
 * 
 * Default value - `15`
 * @throws ArgumentError if the given node distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor%23minimumNodeDistance">Online Documentation</a>
 */
open var minimumNodeDistance: Double
/**
 * Gets or sets the relative vertical alignment of nodes belonging to the same multi-parent structure.
 * 
 * Default value - `0.5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor%23verticalAlignment">Online Documentation</a>
 */
open var verticalAlignment: Double

companion object : ClassMetadata<MultiParentDescriptor> {
}
}

inline fun MultiParentDescriptor(
    block: MultiParentDescriptor.() -> Unit
): MultiParentDescriptor {
    return MultiParentDescriptor()
        .apply(block)
}
