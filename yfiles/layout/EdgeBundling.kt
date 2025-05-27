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
 * An [EdgeBundling] instance defines if and how the edges of a graph should be bundled by an [ILayoutAlgorithm], given that the algorithm supports edge bundling.
 * @see [EdgeBundleDescriptor]
 * @see [CircularLayout.edgeBundling][yfiles.circular.CircularLayout.edgeBundling]
 * @see [RadialLayout.edgeBundling][yfiles.radial.RadialLayout.edgeBundling]
 * @see [TreeReductionStage.edgeBundling][yfiles.tree.TreeReductionStage.edgeBundling]
 * @see [BundledEdgeRouter.edgeBundling][yfiles.router.BundledEdgeRouter.edgeBundling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling">Online Documentation</a>
 */
external class EdgeBundling   {
  /**
   * Gets or sets the desired quality of the calculated edge bundling.
   * 
   * Default value - `0.5`
   * @throws ArgumentError if the given quality value is not within `[0,1]`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling%23bundlingQuality">Online Documentation</a>
   */
  final var bundlingQuality: Double
  
  /**
   * Gets or sets the strength of the edge bundling.
   * 
   * Default value - `0.95`
   * @throws ArgumentError if the given strength is less than `0` or greater than `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling%23bundlingStrength">Online Documentation</a>
   */
  final var bundlingStrength: Double
  
  /**
   * Gets or sets the default [EdgeBundleDescriptor] used for all edges which do not have a specific, individual descriptor assigned via layout data properties.
   * 
   * Default value - [EdgeBundleDescriptor]
   * @throws ArgumentError if the given descriptor is `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling%23defaultBundleDescriptor">Online Documentation</a>
   */
  final var defaultBundleDescriptor: EdgeBundleDescriptor
  
  companion object : ClassMetadata<EdgeBundling> {
    /**
     * A [data key][EdgeDataKey] for specifying individual bundling settings for edges.
     * @see [defaultBundleDescriptor]
     * @see [CircularLayoutData.edgeBundleDescriptors][yfiles.circular.CircularLayoutData.edgeBundleDescriptors]
     * @see [RadialGroupLayoutData.edgeBundleDescriptors]
     * @see [RadialLayoutData.edgeBundleDescriptors][yfiles.radial.RadialLayoutData.edgeBundleDescriptors]
     * @see [BundledEdgeRouterData.edgeBundleDescriptors][yfiles.router.BundledEdgeRouterData.edgeBundleDescriptors]
     * @see [TreeReductionStageData.edgeBundleDescriptors][yfiles.tree.TreeReductionStageData.edgeBundleDescriptors]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling%23EDGE_BUNDLE_DESCRIPTOR_DATA_KEY">Online Documentation</a>
     */
     val EDGE_BUNDLE_DESCRIPTOR_DATA_KEY: EdgeDataKey<EdgeBundleDescriptor>
  }
}
