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

/**
 * An [EdgeBundleDescriptor] defines the [bundling][EdgeBundling] settings of an edge.
 * @see [EdgeBundling]
 * @see [EdgeBundling.EDGE_BUNDLE_DESCRIPTOR_DATA_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new [EdgeBundleDescriptor] representing a copy of the given other descriptor instance.
 * @param [descriptor] The descriptor to copy
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleDescriptor%23EdgeBundleDescriptor-constructor-EdgeBundleDescriptor(EdgeBundleDescriptor)">Online Documentation</a>
 */
external class EdgeBundleDescriptor (
  descriptor: EdgeBundleDescriptor  = definedExternally,
)  {
  /**
   * Gets or sets whether or not a bezier curve should be fit to an edge associated with this descriptor.
   * 
   * Default value - `false`. Edges resemble B-splines.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleDescriptor%23bezierFitting">Online Documentation</a>
   */
  final var bezierFitting: Boolean
  
  /**
   * Gets or sets whether or not an edge associated with this descriptor should be bundled.
   * 
   * Default value - `false`. Generally bundling is disabled, only for the radial group layout bundling is enabled by default
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleDescriptor%23bundled">Online Documentation</a>
   */
  final var bundled: Boolean
  
  /**
   * Gets or sets whether or not the direction of the edge associated to this descriptor should be considered.
   * 
   * Default value - `true`. The direction of the edge is considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleDescriptor%23considerDirection">Online Documentation</a>
   */
  final var considerDirection: Boolean
  
  companion object : ClassMetadata<EdgeBundleDescriptor> {
  }
}

inline fun EdgeBundleDescriptor(
    block: EdgeBundleDescriptor.() -> Unit
): EdgeBundleDescriptor {
    return EdgeBundleDescriptor()
        .apply(block)
}
