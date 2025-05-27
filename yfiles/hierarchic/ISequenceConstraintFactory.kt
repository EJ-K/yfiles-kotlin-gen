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
 * This interface specifies the general contract for factory classes that can be used to associate sequence constraints with a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequenceConstraintFactory">Online Documentation</a>
 */
external interface ISequenceConstraintFactory : YObject {
/**
 * Gets a token that allows to bind a constraint factory to a graph instance after creation.
 * @see [HierarchicLayoutCore.createSequenceConstraintFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequenceConstraintFactory%23memento">Online Documentation</a>
 */
val memento: SequenceConstraintsMemento
/**
 * Adds a constraint that forces the [Node][yfiles.algorithms.Node] or [Edge][yfiles.algorithms.Edge] with id `after` to lie after the [Node][yfiles.algorithms.Node] or [Edge][yfiles.algorithms.Edge] with id `reference`.
 * @param [referenceId] the ID of the reference node or edge
 * @param [afterId] the ID of the node or edge that should be placed after the reference element
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequenceConstraintFactory%23ISequenceConstraintFactory-method-addPlaceAfterConstraint">Online Documentation</a>
 */
   fun addPlaceAfterConstraint( referenceId: Id ,
 afterId: Id )
/**
 * Adds a constraint that places a [Node][yfiles.algorithms.Node] or [Edge][yfiles.algorithms.Edge] at the start of the sequence.
 * @param [id] the ID of the node or edge that should be placed at the start
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequenceConstraintFactory%23ISequenceConstraintFactory-method-addPlaceAtHeadConstraint">Online Documentation</a>
 */
   fun addPlaceAtHeadConstraint( id: Id )
/**
 * Adds a constraint that places a [Node][yfiles.algorithms.Node] or [Edge][yfiles.algorithms.Edge] at the end of the sequence.
 * @param [id] the ID of the node or edge that should be placed at the end
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequenceConstraintFactory%23ISequenceConstraintFactory-method-addPlaceAtTailConstraint">Online Documentation</a>
 */
   fun addPlaceAtTailConstraint( id: Id )
/**
 * Adds a constraint that forces the [Node][yfiles.algorithms.Node] or [Edge][yfiles.algorithms.Edge] with id `before` to lie before the [Node][yfiles.algorithms.Node] or [Edge][yfiles.algorithms.Edge] with id `reference`.
 * @param [referenceId] the ID of the reference node or edge
 * @param [beforeId] the ID of the node or edge that should be placed before the reference element
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequenceConstraintFactory%23ISequenceConstraintFactory-method-addPlaceBeforeConstraint">Online Documentation</a>
 */
   fun addPlaceBeforeConstraint( referenceId: Id ,
 beforeId: Id )
/**
 * Disposes of the [ISequenceConstraintFactory].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequenceConstraintFactory%23ISequenceConstraintFactory-method-dispose">Online Documentation</a>
 */
   fun dispose()

companion object : InterfaceMetadata<ISequenceConstraintFactory> {
}
}
