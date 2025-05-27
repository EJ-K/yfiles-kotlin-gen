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
 * This interface provides methods for creating layering constraints.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory">Online Documentation</a>
 */
external interface ILayerConstraintFactory : YObject {
/**
 * Gets a token that allows to bind a constraint factory to a graph instance after creation.
 * @see [HierarchicLayout.createLayerConstraintFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory%23memento">Online Documentation</a>
 */
val memento: LayerConstraintsMemento
/**
 * Adds a constraint that forces the [Node][yfiles.algorithms.Node] with ID `aboveId` to lie above the [Node][yfiles.algorithms.Node] with ID `referenceId`.
 * @param [referenceId] the ID of the reference node
 * @param [aboveId] the ID of the node that should lie above
 * @return a [ILayerConstraint] object that represents the constraint
 * @see [ILayerConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory%23ILayerConstraintFactory-method-addPlaceNodeAboveConstraint(Object,Object)">Online Documentation</a>
 */
   fun addPlaceNodeAboveConstraint( referenceId: Id ,
 aboveId: Id ):ILayerConstraint
/**
 * Adds a constraint that forces the [Node][yfiles.algorithms.Node] with ID `aboveId` to lie at least `minDistance` layers above the [Node][yfiles.algorithms.Node] with ID `referenceId` with a given weight penalty for larger layer differences.
 * @param [referenceId] the ID of the reference node
 * @param [aboveId] the ID of the node that should lie above
 * @param [minDistance] the minimum layer distance between the node and its reference node
 * @param [weight] the weight penalty for larger layer differences
 * @return a [ILayerConstraint] object that represents the constraint
 * @see [ILayerConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory%23ILayerConstraintFactory-method-addPlaceNodeAboveConstraint(Object,Object,number,number)">Online Documentation</a>
 */
   fun addPlaceNodeAboveConstraint( referenceId: Id ,
 aboveId: Id ,
 minDistance: Double ,
 weight: Double  = definedExternally):ILayerConstraint
/**
 * Adds a constraint that places a [Node][yfiles.algorithms.Node] on the bottom layer.
 * @param [nodeId] the ID of the node that should lie on the bottom layer
 * @return a [ILayerConstraint] object that represents the constraint
 * @see [ILayerConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory%23ILayerConstraintFactory-method-addPlaceNodeAtBottomConstraint">Online Documentation</a>
 */
   fun addPlaceNodeAtBottomConstraint( nodeId: Id ):ILayerConstraint
/**
 * Adds a constraint that places a [Node][yfiles.algorithms.Node] on the topmost layer.
 * @param [nodeId] the ID of the node that should lie on the top layer
 * @return a [ILayerConstraint] object that represents the constraint
 * @see [ILayerConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory%23ILayerConstraintFactory-method-addPlaceNodeAtTopConstraint">Online Documentation</a>
 */
   fun addPlaceNodeAtTopConstraint( nodeId: Id ):ILayerConstraint
/**
 * Adds a constraint that forces a [Node][yfiles.algorithms.Node] with ID `belowId` to lie below the [Node][yfiles.algorithms.Node] with ID `referenceId`.
 * @param [referenceId] the ID of the reference node
 * @param [belowId] the ID of the node that should lie below
 * @return a [ILayerConstraint] object that represents the constraint
 * @see [ILayerConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory%23ILayerConstraintFactory-method-addPlaceNodeBelowConstraint(Object,Object)">Online Documentation</a>
 */
   fun addPlaceNodeBelowConstraint( referenceId: Id ,
 belowId: Id ):ILayerConstraint
/**
 * Adds a constraint that forces the [Node][yfiles.algorithms.Node] with ID `belowId` to lie at least `minDistance` layers below the [Node][yfiles.algorithms.Node] with ID `referenceId` with a given weight penalty for larger layer differences.
 * @param [referenceId] the ID of the reference node
 * @param [belowId] the ID of the node that should lie below
 * @param [minDistance] the minimum layer distance between the node and its reference node
 * @param [weight] the weight penalty for larger layer differences
 * @return a [ILayerConstraint] object that represents the constraint
 * @see [ILayerConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory%23ILayerConstraintFactory-method-addPlaceNodeBelowConstraint(Object,Object,number,number)">Online Documentation</a>
 */
   fun addPlaceNodeBelowConstraint( referenceId: Id ,
 belowId: Id ,
 minDistance: Double ,
 weight: Double  = definedExternally):ILayerConstraint
/**
 * Adds a constraint that forces the [Node][yfiles.algorithms.Node] with ID `sameLayerId` to lie in the same layer as the [Node][yfiles.algorithms.Node] with ID `referenceId`.
 * @param [referenceId] the ID of the reference node
 * @param [sameLayerId] the ID of the node that should lie in the same layer
 * @return a [ILayerConstraint] object that represents the constraint
 * @see [ILayerConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory%23ILayerConstraintFactory-method-addPlaceNodeInSameLayerConstraint">Online Documentation</a>
 */
   fun addPlaceNodeInSameLayerConstraint( referenceId: Id ,
 sameLayerId: Id ):ILayerConstraint
/**
 * Disposes this factory.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory%23ILayerConstraintFactory-method-dispose">Online Documentation</a>
 */
   fun dispose()
/**
 * Clears all constraints for a given [Node][yfiles.algorithms.Node].
 * @param [nodeId] the ID of the node for which all constraints should be cleared
 * @see [ILayerConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraintFactory%23ILayerConstraintFactory-method-removeConstraints">Online Documentation</a>
 */
   fun removeConstraints( nodeId: Id )

companion object : InterfaceMetadata<ILayerConstraintFactory> {
}
}
