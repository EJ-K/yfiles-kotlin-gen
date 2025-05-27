// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.EdgeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This class is a [ILayerer] implementation that observes relative and absolute layering constraints defined by the [layer constraint factory][ILayerConstraintFactory].
 * @see [ILayerConstraintFactory]
 * @see [HierarchicLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstraintIncrementalLayerer">Online Documentation</a>
 * 
 * @constructor Creates a new [ConstraintIncrementalLayerer] with the given [ILayerer] instance as its core layerer.
 * @param [coreLayerer] the given [ILayerer] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstraintIncrementalLayerer%23ConstraintIncrementalLayerer-constructor-ConstraintIncrementalLayerer">Online Documentation</a>
 */
external open class ConstraintIncrementalLayerer  ( coreLayerer: ILayerer ) : ILayerer {

/**
 * Gets or sets whether or not same-layer edges can be created by this [ILayerer] instance.
 * 
 * Default value - `false`. Same-layer edges cannot be created by this [ILayerer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstraintIncrementalLayerer%23allowSameLayerEdges">Online Documentation</a>
 */
open var allowSameLayerEdges: Boolean
/**
 * Gets or sets the time limit in milliseconds set for the algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The layout algorithm runs unrestricted.
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstraintIncrementalLayerer%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Assigns all nodes of the graph to layers and adds them to the [ILayers] instance based on relative and absolute layering constraints defined by the given layering constraints.
 * @param [graph] the input graph
 * @param [layers] the [ILayers] instance that will be filled with the results of the calculation
 * @param [ldp] the [ILayoutDataProvider] used for query information about the nodes and edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstraintIncrementalLayerer%23ConstraintIncrementalLayerer-method-assignLayers">Online Documentation</a>
 */
 override   fun assignLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )
/**
 * Checks if the current setting of constraints is consistent, that is, the induced constraint graph has no cycles.
 * @throws ArgumentError if the constraint graph is inconsistent
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstraintIncrementalLayerer%23ConstraintIncrementalLayerer-method-checkConstraints">Online Documentation</a>
 */
 open protected   fun checkConstraints()

companion object : ClassMetadata<ConstraintIncrementalLayerer> {
/**
 * A data provider key for assigning additional edge weights.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstraintIncrementalLayerer%23ADDITIONAL_EDGE_WEIGHT_DP_KEY">Online Documentation</a>
 */
 val ADDITIONAL_EDGE_WEIGHT_DP_KEY: EdgeDpKey<Double>
}
}
