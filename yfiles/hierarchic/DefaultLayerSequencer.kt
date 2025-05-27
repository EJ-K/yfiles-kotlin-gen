// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Edge
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This class is a [ISequencer] implementation that performs the second phase of the Sugiyama algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayerSequencer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [DefaultLayerSequencer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayerSequencer%23DefaultLayerSequencer-constructor-DefaultLayerSequencer">Online Documentation</a>
 */
external open class DefaultLayerSequencer  () : ISequencer {

/**
 * Gets or sets whether or not an additional crossing minimization heuristic should be used in the presence of grouped graphs.
 * 
 * Default value - `false`. The group transposition rule is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayerSequencer%23groupTransposition">Online Documentation</a>
 */
open var groupTransposition: Boolean
/**
 * Gets or sets the time limit (in milliseconds) set for this sequencer per execution.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The algorithm runs unrestricted.
 * @throws ArgumentError if the maximum duration is negative.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayerSequencer%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the number of randomized rounds that this algorithm performs, if there was no optimal solution.
 * 
 * Default value - `50`. The number of randomized rounds is `50`, if the [maximum duration][maximumDuration] is limited this value may be automatically reduced to `14`.
 * @throws ArgumentError if a negative value is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayerSequencer%23randomizationRounds">Online Documentation</a>
 */
open var randomizationRounds: Int
/**
 * Gets or sets whether or not to apply an additional crossing minimization heuristic.
 * 
 * Default value - `true`. The transposition rule is active.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayerSequencer%23transposition">Online Documentation</a>
 */
open var transposition: Boolean
/**
 * Gets or sets the weight heuristic that should be used.
 * 
 * Default value - [WeightHeuristic.BARYCENTER]. A barycenter heuristic is used.
 * @throws ArgumentError if the constant is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayerSequencer%23weightHeuristic">Online Documentation</a>
 */
open var weightHeuristic: WeightHeuristic
/**
 * Returns the cost of an edge crossing between the two given edges.
 * @param [edge1] the first edge involved in the crossing
 * @param [edge2] the second edge involved in the crossing
 * @param [layoutDataProvider] the [ILayoutDataProvider] containing information about the edges and nodes
 * @return the crossing cost for the two given edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayerSequencer%23DefaultLayerSequencer-method-getCrossingCost">Online Documentation</a>
 */
 open protected   fun getCrossingCost( edge1: Edge ,
 edge2: Edge ,
 layoutDataProvider: ILayoutDataProvider ):Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayerSequencer%23DefaultLayerSequencer-method-sequenceNodeLayers">Online Documentation</a>
 */
 override   fun sequenceNodeLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )

companion object : ClassMetadata<DefaultLayerSequencer> {
}
}

inline fun DefaultLayerSequencer(
    block: DefaultLayerSequencer.() -> Unit
): DefaultLayerSequencer {
    return DefaultLayerSequencer()
        .apply(block)
}
