// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This class is a wrapper [ILayerer] implementation that delegates the actual layering to a delegate [ILayerer] object.
 * @see [desiredAspectRatio]
 * @see [MultiComponentLayerer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioComponentLayerer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [AspectRatioComponentLayerer] using the given delegate [ILayerer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioComponentLayerer%23AspectRatioComponentLayerer-constructor-AspectRatioComponentLayerer">Online Documentation</a>
 * 
 * @property singleComponentLayerer
 * Gets or sets the delegate [ILayerer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioComponentLayerer%23singleComponentLayerer">Online Documentation</a>
 */
external open class AspectRatioComponentLayerer  (
open var singleComponentLayerer: ILayerer) : ILayerer {

/**
 * Gets or sets whether or not the size of the nodes should be considered.
 * 
 * Default value - `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioComponentLayerer%23considerNodeSize">Online Documentation</a>
 */
open var considerNodeSize: Boolean
/**
 * Gets or sets the desired aspect ratio.
 * 
 * Default value - `1`
 * @throws ArgumentError if the aspect ratio is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioComponentLayerer%23desiredAspectRatio">Online Documentation</a>
 */
open var desiredAspectRatio: Double
/**
 * Assigns all nodes of the graph to layers and registers them to the [ILayers] instance based on the given aspect ratio.
 * @param [graph] the input graph
 * @param [layers] the [ILayers] instance that will be filled with the results of the calculation
 * @param [ldp] the [ILayoutDataProvider] used for query information about the nodes and edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioComponentLayerer%23AspectRatioComponentLayerer-method-assignLayers">Online Documentation</a>
 */
 override   fun assignLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )

companion object : ClassMetadata<AspectRatioComponentLayerer> {
}
}
