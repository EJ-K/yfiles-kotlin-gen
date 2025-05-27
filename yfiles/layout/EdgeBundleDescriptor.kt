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
 * An [EdgeBundleDescriptor] defines the [bundling][EdgeBundling] settings of an edge.
 * @see [EdgeBundling]
 * @see [EdgeBundling.EDGE_BUNDLE_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new [EdgeBundleDescriptor] representing a copy of the given other descriptor instance.
 * @param [descriptor] the descriptor to copy
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleDescriptor%23EdgeBundleDescriptor-constructor-EdgeBundleDescriptor(EdgeBundleDescriptor)">Online Documentation</a>
 */
external open class EdgeBundleDescriptor  ( descriptor: EdgeBundleDescriptor  = definedExternally) : YObject {

/**
 * Gets or sets whether or not a bezier curve should be fit to an edge associated to this descriptor.
 * 
 * Default value - `false`. Edges resemble B-splines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleDescriptor%23bezierFitting">Online Documentation</a>
 */
open var bezierFitting: Boolean
/**
 * Gets or sets whether or not an edge associated to this descriptor should be bundled.
 * 
 * Default value - `false`. Generally bundling is disabled, only for the cactus group layout bundling is enabled by default
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleDescriptor%23bundled">Online Documentation</a>
 */
open var bundled: Boolean
/**
 * Gets or sets whether or not the direction of the edge associated to this descriptor should be considered.
 * 
 * Default value - `true`. The direction of the edge is considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleDescriptor%23considerDirection">Online Documentation</a>
 */
open var considerDirection: Boolean

companion object : ClassMetadata<EdgeBundleDescriptor> {
}
}

inline fun EdgeBundleDescriptor(
    block: EdgeBundleDescriptor.() -> Unit
): EdgeBundleDescriptor {
    return EdgeBundleDescriptor()
        .apply(block)
}
