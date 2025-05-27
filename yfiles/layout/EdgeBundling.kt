// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.EdgeDpKey
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * An [EdgeBundling] instance defines if and how the edges of a graph should be bundled by a [layout algorithm][ILayoutAlgorithm], given that the algorithm supports edge bundling.
 * @see [EdgeBundleDescriptor]
 * @see [CircularLayout.edgeBundling][yfiles.circular.CircularLayout.edgeBundling]
 * @see [RadialLayout.edgeBundling][yfiles.radial.RadialLayout.edgeBundling]
 * @see [TreeReductionStage.edgeBundling][yfiles.tree.TreeReductionStage.edgeBundling]
 * @see [EdgeBundlingStage.edgeBundling][yfiles.router.EdgeBundlingStage.edgeBundling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling">Online Documentation</a>
 * 
 * @constructor Creates a new [EdgeBundling] instance with the given [bundling strength][bundlingStrength] and [bundling quality][bundlingQuality].
 * @param [bundlingStrength] the bundling strength from the interval `[0,1]`
 * @param [bundlingQuality] the bundling quality from the interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling%23EdgeBundling-constructor-EdgeBundling">Online Documentation</a>
 * 
 * @property bundlingStrength
 * Gets or sets the strength of the edge bundling.
 * 
 * Default value - `0.95`
 * @throws ArgumentError if the given strength is less than `0` or greater than `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling%23bundlingStrength">Online Documentation</a>
 * 
 * @property bundlingQuality
 * Gets or sets the desired quality of the calculated edge bundling.
 * 
 * Default value - `0.5`
 * @throws ArgumentError if the given quality value is not within `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling%23bundlingQuality">Online Documentation</a>
 */
external open class EdgeBundling  (
open var bundlingStrength: Double = definedExternally,
open var bundlingQuality: Double = definedExternally) : YObject {

/**
 * Gets or sets the default [EdgeBundleDescriptor] used for all edges which do not have a specific descriptor assigned via a [IDataProvider][yfiles.algorithms.IDataProvider] registered with key [EDGE_BUNDLE_DESCRIPTOR_DP_KEY].
 * 
 * Default value - [EdgeBundleDescriptor]
 * @throws ArgumentError if the given descriptor is `null`
 * @see [EDGE_BUNDLE_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling%23defaultBundleDescriptor">Online Documentation</a>
 */
open var defaultBundleDescriptor: EdgeBundleDescriptor

companion object : ClassMetadata<EdgeBundling> {
/**
 * A data provider key for specifying individual bundling settings for edges.
 * @see [defaultBundleDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundling%23EDGE_BUNDLE_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val EDGE_BUNDLE_DESCRIPTOR_DP_KEY: EdgeDpKey<EdgeBundleDescriptor>
}
}

inline fun EdgeBundling(
    block: EdgeBundling.() -> Unit
): EdgeBundling {
    return EdgeBundling()
        .apply(block)
}
