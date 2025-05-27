// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.core.Void
import yfiles.collections.IEnumerable
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata
import yfiles.view.ICanvasObjectDescriptor
import yfiles.view.IVisualTemplate
import yfiles.view.ResourceKey

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
external open class LabelPositionHandler  (
protected final val label: ILabel) : IPositionHandler {

/**
 * Gets or sets the template to use for showing candidates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23candidateTemplate">Online Documentation</a>
 */
final var candidateTemplate: IVisualTemplate<Void>
/**
 * Gets the graph instance from the [IInputModeContext] that has been passed to the [initializeDrag] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23graph">Online Documentation</a>
 */
protected final val graph: IGraph?
/**
 * Gets or sets the template to use for showing highlighted candidates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23highlightTemplate">Online Documentation</a>
 */
final var highlightTemplate: IVisualTemplate<Void>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23location">Online Documentation</a>
 */
final override val location: IPoint
/**
 * Gets or sets a property that determines whether the handler may use a [ILabelModelParameterFinder] to assign arbitrary positions.
 * 
 * The default value is `true`
 * @see [useParameterFinder]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23useFinder">Online Documentation</a>
 */
final var useFinder: Boolean
/**
 * Gets or sets how the moved label should be shown during the gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23visualization">Online Documentation</a>
 */
final var visualization: Visualization
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-cancelDrag">Online Documentation</a>
 */
 override   fun cancelDrag( context: IInputModeContext ,
 originalLocation: Point )
/**
 * Creates an [ICanvasObjectDescriptor] to display the given candidate position.
 * @param [context] The context for which the descriptor is created.
 * @param [highlight] Whether to highlight the candidate. This will be `true` for the current position and `false` for the others.
 * @return An implementation that will render the given candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-createCandidateDescriptor">Online Documentation</a>
 */
 open protected   fun createCandidateDescriptor( context: IInputModeContext ,
 highlight: Boolean ):ICanvasObjectDescriptor<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-dragFinished">Online Documentation</a>
 */
 override   fun dragFinished( context: IInputModeContext ,
 originalLocation: Point ,
 newLocation: Point )
/**
 * Calculates a distance value between a candidate rectangle and the mouse location.
 * @param [rectangle] The rectangle candidate.
 * @param [location] The mouse location.
 * @return A value indicating the closeness of the mouse to the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-getDistance">Online Documentation</a>
 */
 open protected   fun getDistance( rectangle: IOrientedRectangle ,
 location: Point ):Double
/**
 * Gets the candidates for the given label.
 * @param [label] The label.
 * @return A possibly empty enumerator over possible label parameter candidates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-getParameterCandidates">Online Documentation</a>
 */
 open protected   fun getParameterCandidates( label: ILabel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-handleMove">Online Documentation</a>
 */
 override   fun handleMove( context: IInputModeContext ,
 originalLocation: Point ,
 newLocation: Point )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-initializeDrag">Online Documentation</a>
 */
 override   fun initializeDrag( context: IInputModeContext )
/**
 * Actually applies the given parameter at the end of the gesture.
 * @param [label] The label to set the parameter for.
 * @param [layoutParameter] The new parameter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-setLayoutParameter">Online Documentation</a>
 */
 open protected   fun setLayoutParameter( label: ILabel ,
 layoutParameter: ILabelModelParameter )
/**
 * Called by clients to set the position to the given coordinates.
 * @param [location] The new location.
 * @see [IDragHandler.location]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-setPosition">Online Documentation</a>
 */
 open   fun setPosition( location: Point )
/**
 * Determines whether to use a [ILabelModelParameterFinder] to find the best candidate.
 * @param [context] The context that is currently being used - may be `null` if the method is called without context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23LabelPositionHandler-method-useParameterFinder">Online Documentation</a>
 */
 open protected   fun useParameterFinder( context: IInputModeContext? ):Boolean

companion object : ClassMetadata<LabelPositionHandler> {
/**
 * A [String] that will be used to find the [IVisualTemplate] that will be used to represent the rectangular selection.
 * 
 * The default template has the `yfiles-label-position-candidate-template` CSS class and uses visualizations based on the [ThemeVariant][yfiles.view.ThemeVariant] of the current [CanvasComponent.theme][yfiles.view.CanvasComponent.theme]:
 * - **[ThemeVariant.CLASSIC][yfiles.view.ThemeVariant.CLASSIC]** &#x2013; Rectangle with a light-gray stroke.
 * - **[ThemeVariant.SIMPLE_ROUND][yfiles.view.ThemeVariant.SIMPLE_ROUND]** &#x2013; Round-Rectangle with stroke in [Theme.secondaryColor][yfiles.view.Theme.secondaryColor].
 * - **[ThemeVariant.SIMPLE_SQUARE][yfiles.view.ThemeVariant.SIMPLE_SQUARE]** &#x2013; Rectangle with stroke in [Theme.secondaryColor][yfiles.view.Theme.secondaryColor].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23CANDIDATE_TEMPLATE_KEY">Online Documentation</a>
 */
 val CANDIDATE_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
/**
 * A [String] that will be used to find the [IVisualTemplate] that will be used to represent the rectangular selection.
 * 
 * The default template has the `yfiles-label-position-highlight-template` CSS class and uses visualizations based on the [ThemeVariant][yfiles.view.ThemeVariant] of the current [CanvasComponent.theme][yfiles.view.CanvasComponent.theme]:
 * - **[ThemeVariant.CLASSIC][yfiles.view.ThemeVariant.CLASSIC]** &#x2013; Rectangle with a dark-gray stroke.
 * - **[ThemeVariant.SIMPLE_ROUND][yfiles.view.ThemeVariant.SIMPLE_ROUND]** &#x2013; Round-Rectangle with stroke in [Theme.primaryColor][yfiles.view.Theme.primaryColor].
 * - **[ThemeVariant.SIMPLE_SQUARE][yfiles.view.ThemeVariant.SIMPLE_SQUARE]** &#x2013; Rectangle with stroke in [Theme.primaryColor][yfiles.view.Theme.primaryColor].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPositionHandler%23HIGHLIGHT_TEMPLATE_KEY">Online Documentation</a>
 */
 val HIGHLIGHT_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
}
}
