// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface provides factory methods for creating incremental hints for the hierarchic layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIncrementalHintsFactory">Online Documentation</a>
 */
external interface IIncrementalHintsFactory : YObject {
/**
 * Creates a hint [Object] for a group [Node][yfiles.algorithms.Node] that should be inserted incrementally during the layering phase.
 * @param [forItemId] the group node to be inserted incrementally
 * @return an [Object] that can be interpreted as a hint by [HierarchicLayoutCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIncrementalHintsFactory%23IIncrementalHintsFactory-method-createIncrementalGroupHint">Online Documentation</a>
 */
   fun createIncrementalGroupHint( forItemId: Id ):IncrementalHint
/**
 * Creates a hint [Object] for a [Node][yfiles.algorithms.Node] that should be inserted incrementally during the layering phase.
 * @param [forNodeId] the node to be layered and sequenced incrementally
 * @return an [Object] that can be interpreted as a hint by [HierarchicLayoutCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIncrementalHintsFactory%23IIncrementalHintsFactory-method-createLayerIncrementallyHint">Online Documentation</a>
 */
   fun createLayerIncrementallyHint( forNodeId: Id ):IncrementalHint
/**
 * Creates a hint [Object] for a [Node][yfiles.algorithms.Node] or [Edge][yfiles.algorithms.Edge] that should be inserted incrementally during the sequencing phase.
 * @param [forItemId] the node or edge to be sequenced/inserted incrementally
 * @return an [Object] that can be interpreted as a hint by [HierarchicLayoutCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIncrementalHintsFactory%23IIncrementalHintsFactory-method-createSequenceIncrementallyHint">Online Documentation</a>
 */
   fun createSequenceIncrementallyHint( forItemId: Id ):IncrementalHint
/**
 * Creates a hint [Object] for a [Node][yfiles.algorithms.Node] that should be inserted incrementally into the graph on its exact current position.
 * @param [forNodeId] the node to be placed on its exact current position
 * @return an [Object] that can be interpreted as a hint by [HierarchicLayoutCore]
 * @see [createUseExactSequenceCoordinatesHint]
 * @see [createUseExactLayerCoordinatesHint]
 * @see [SimplexNodePlacer.exactPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIncrementalHintsFactory%23IIncrementalHintsFactory-method-createUseExactCoordinatesHint">Online Documentation</a>
 */
   fun createUseExactCoordinatesHint( forNodeId: Id ):IncrementalHint
/**
 * Creates a hint [Object] for a [Node][yfiles.algorithms.Node] that should be inserted incrementally into the graph on its exact current layer position.
 * @param [forNodeId] the node to be placed on its exact current layer position
 * @return an [Object] that can be interpreted as a hint by [HierarchicLayoutCore]
 * @see [createUseExactCoordinatesHint]
 * @see [createUseExactSequenceCoordinatesHint]
 * @see [SimplexNodePlacer.exactPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIncrementalHintsFactory%23IIncrementalHintsFactory-method-createUseExactLayerCoordinatesHint">Online Documentation</a>
 */
   fun createUseExactLayerCoordinatesHint( forNodeId: Id ):IncrementalHint
/**
 * Creates a hint [Object] for a [Node][yfiles.algorithms.Node] that should be inserted incrementally into the graph on its exact current sequence position.
 * @param [forNodeId] the node to be placed on its exact current sequence position
 * @return an [Object] that can be interpreted as a hint by [HierarchicLayoutCore]
 * @see [createUseExactCoordinatesHint]
 * @see [createUseExactLayerCoordinatesHint]
 * @see [SimplexNodePlacer.exactPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIncrementalHintsFactory%23IIncrementalHintsFactory-method-createUseExactSequenceCoordinatesHint">Online Documentation</a>
 */
   fun createUseExactSequenceCoordinatesHint( forNodeId: Id ):IncrementalHint

companion object : InterfaceMetadata<IIncrementalHintsFactory> {
}
}
