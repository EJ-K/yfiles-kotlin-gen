// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.ILabelModelParameter
import yfiles.graph.ILabelModelParameterFinder
import yfiles.lang.ClassMetadata
import yfiles.view.IObjectRenderer

/**
 * An implementation of [IPositionHandler] that shows the various label position candidates and lets the user move a label to one of those candidate positions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LabelPositionHandler] class.
 * @param [label] The label that shall be moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-constructor-LabelPositionHandler">Online Documentation</a>
 * 
 * @property label
 * Gets the label instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23label">Online Documentation</a>
 */
open external class LabelPositionHandler (
protected final val label: ILabel) : IPositionHandler {
  /**
   * Gets or sets the [IObjectRenderer] that visualizes label candidates while moving labels.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23candidateRenderer">Online Documentation</a>
   */
  final var candidateRenderer: IObjectRenderer<LabelCandidateRenderTag>
  
  /**
   * Gets the graph instance from the [IInputModeContext] that has been passed to the [initializeDrag][LabelPositionHandler] method.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23graph">Online Documentation</a>
   */
  protected final val graph: IGraph?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23location">Online Documentation</a>
   */
  final override val location: IPoint
  
  /**
   * Gets or sets a property that determines whether the handler should refuse to move the label when there are other, possibly conflicting items being moved at the same time.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23preventConflictingMixedMoves">Online Documentation</a>
   */
  final var preventConflictingMixedMoves: Boolean
  
  /**
   * Gets or sets the recognizer that determines whether the user wants to manually enable the usage of [ILabelModelParameterFinder] to specify the position for new label.
   * 
   * The default detects the current platform and delegates either to [META_IS_DOWN][EventRecognizers] (macOS) or [CTRL_IS_DOWN][EventRecognizers] (other platforms).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23useParameterFinderRecognizer">Online Documentation</a>
   */
  final var useParameterFinderRecognizer: EventRecognizer
  
  /**
   * Gets or sets how the moved label should be shown during the gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23visualization">Online Documentation</a>
   */
  final var visualization: Visualization
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-cancelDrag">Online Documentation</a>
   */
  override fun cancelDrag(
    context: IInputModeContext,
    originalLocation: Point,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-dragFinished">Online Documentation</a>
   */
  override fun dragFinished(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * Calculates a distance value between a candidate rectangle and the mouse location.
   * @param [rectangle] The rectangle candidate.
   * @param [location] The mouse location.
   * @return A value indicating the closeness of the mouse to the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-getDistance">Online Documentation</a>
   */
  protected open fun getDistance(
    rectangle: IOrientedRectangle,
    location: Point,
  ): Double
  
  /**
   * Gets the candidates for the given label.
   * @param [label] The label.
   * @return A possibly empty enumerator over possible label parameter candidates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-getParameterCandidates">Online Documentation</a>
   */
  protected open fun getParameterCandidates(
    label: ILabel,
  ): IEnumerable<ILabelModelParameter>
  
  /**
   * Provides the [ILabelModelParameterFinder] for calculating the label's candidates.
   * @param [label] The label for which to find the parameter
   * @return An [ILabelModelParameterFinder] provided in the lookup of the given label, or a default implementation that finds the closest matching parameter.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-getParameterFinder">Online Documentation</a>
   */
  protected open fun getParameterFinder(
    label: ILabel,
  ): ILabelModelParameterFinder
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-handleMove">Online Documentation</a>
   */
  override fun handleMove(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-initializeDrag">Online Documentation</a>
   */
  override fun initializeDrag(
    context: IInputModeContext,
  )
  
  /**
   * Actually applies the given parameter at the end of the gesture.
   * @param [label] The label to set the parameter for.
   * @param [layoutParameter] The new parameter.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-setLayoutParameter">Online Documentation</a>
   */
  protected open fun setLayoutParameter(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  )
  
  /**
   * Determines whether to ignore upcoming [handleMove][LabelPositionHandler] and [dragFinished][LabelPositionHandler] calls.
   * @param [context] The context of [drag-started][MoveInputMode].
   * @return `true` when the [label][LabelPositionHandler] should not be updated for upcoming [handleMove][LabelPositionHandler] and [dragFinished][LabelPositionHandler] operations.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-shouldIgnoreMoves">Online Documentation</a>
   */
  protected open fun shouldIgnoreMoves(
    context: IInputModeContext,
  ): Boolean
  
  /**
   * Determines whether to use a [ILabelModelParameterFinder] to find the best candidate.
   * @param [context] The context that is currently being used.
   * @return `true` if the [ILabelModelParameterFinder] should be used; otherwise, `false`.
   * @see [useParameterFinderRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-shouldUseParameterFinder">Online Documentation</a>
   */
  protected open fun shouldUseParameterFinder(
    context: IInputModeContext,
  ): Boolean
  
  companion object : ClassMetadata<LabelPositionHandler> {
  }
}
