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
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1

/**
 * Manages interactive snapping of [ILabel][yfiles.graph.ILabel]s to their owner during drag operations like movements.
 * @see [MoveLabelInputMode]
 * @see [GraphEditorInputMode.snapContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LabelSnapContext] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23LabelSnapContext-constructor-LabelSnapContext">Online Documentation</a>
 */
external open class LabelSnapContext  () : SnapContext {

/**
 * Gets or sets whether this instance should collect snap lines in parallel to the edge path of the label owner at the distance of other edge labels in the graph.
 * 
 * The default is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23collectAllEdgeDistanceSnapLines">Online Documentation</a>
 */
final var collectAllEdgeDistanceSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect snap lines in parallel to the border of the label owner at the distance of other node labels in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23collectAllNodeDistanceSnapLines">Online Documentation</a>
 */
final var collectAllNodeDistanceSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect snap lines on the edge path.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23collectEdgePathSnapLines">Online Documentation</a>
 */
final var collectEdgePathSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect snap lines for the initial position of a label.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23collectInitialLocationSnapLines">Online Documentation</a>
 */
final var collectInitialLocationSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect six snap lines, two through the center and four through the border sides of the label owner.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23collectNodeShapeSnapLines">Online Documentation</a>
 */
final var collectNodeShapeSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect two snap lines in parallel to the edge path of the label owner at the initial distance of the edge label.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23collectOwnEdgeDistanceSnapLines">Online Documentation</a>
 */
final var collectOwnEdgeDistanceSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect four snap lines in parallel to the owner's borders at the initial label distance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23collectOwnNodeDistanceSnapLines">Online Documentation</a>
 */
final var collectOwnNodeDistanceSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect snap lines to the center of the owner port.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23collectPortSnapLines">Online Documentation</a>
 */
final var collectPortSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect snap lines in parallel to the edge path of the label owner at the distances of all edge labels of that owner.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23collectSameOwnerEdgeDistanceSnapLines">Online Documentation</a>
 */
final var collectSameOwnerEdgeDistanceSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect snap lines in parallel to the border of the label owner at the distance of other node labels of that owner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23collectSameOwnerNodeDistanceSnapLines">Online Documentation</a>
 */
final var collectSameOwnerNodeDistanceSnapLines: Boolean
/**
 * Gets or sets whether this context will automatically snap the edge labels to snap lines.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23snapEdgeLabels">Online Documentation</a>
 */
final var snapEdgeLabels: Boolean
/**
 * Gets or sets the amount by which snap lines that are induced by existing edge segments are being extended.
 * 
 * The default is `40.0`, this value will be used to lengthen the ends of the snap lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23snapLineExtension">Online Documentation</a>
 */
final var snapLineExtension: Double
/**
 * Gets the collection of the [snap lines][SnapLine] that have been [added][addSnapLine] to this context.
 * @see [addSnapLine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23snapLines">Online Documentation</a>
 */
final val snapLines: IEnumerable<SnapLine>
/**
 * Gets or sets whether this context will automatically snap the node labels to snap lines.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23snapNodeLabels">Online Documentation</a>
 */
final var snapNodeLabels: Boolean
/**
 * Gets or sets whether this context will automatically snap the port labels to snap lines.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23snapPortLabels">Online Documentation</a>
 */
final var snapPortLabels: Boolean
/**
 * Adds the given `snapLine` to the [snap line][snapLines] collection of this context.
 * @param [snapLine] The snap line to add.
 * @see [GraphSnapContext.additionalSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23LabelSnapContext-method-addSnapLine">Online Documentation</a>
 */
 final   fun addSnapLine( snapLine: SnapLine )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23LabelSnapContext-method-cleanUp">Online Documentation</a>
 */
 override   fun cleanUp()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23LabelSnapContext-method-dragFinished">Online Documentation</a>
 */
 override   fun dragFinished( newLocation: Point ,
 snappingDisabled: Boolean ):SnapState
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23LabelSnapContext-method-dragInitialized">Online Documentation</a>
 */
 override   fun dragInitialized()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23LabelSnapContext-method-handleMove">Online Documentation</a>
 */
 override   fun handleMove( newLocation: Point ,
 snappingDisabled: Boolean ):SnapState
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23LabelSnapContext-method-initializeDrag">Online Documentation</a>
 */
 override   fun initializeDrag( context: IInputModeContext ,
 originalLocation: Point )
/**
 * Raises the [CollectSnapLines] event.
 * @param [event] The [CollectLabelSnapLineEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23LabelSnapContext-method-onCollectSnapLines">Online Documentation</a>
 */
 open protected   fun onCollectSnapLines( event: CollectLabelSnapLineEventArgs )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23LabelSnapContext-method-wrapContext">Online Documentation</a>
 */
 override   fun wrapContext( context: IInputModeContext ):IInputModeContext
/**
 * Occurs every time this instance has been [initialized][SnapContext.dragInitialized] to collect [SnapLine]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23CollectSnapLines">Online Documentation</a>
 */
fun addCollectSnapLinesListener(listener: EventHandler1<CollectLabelSnapLineEventArgs>)
fun removeCollectSnapLinesListener(listener: EventHandler1<CollectLabelSnapLineEventArgs>)

companion object : ClassMetadata<LabelSnapContext> {
}
}

inline fun LabelSnapContext(
    block: LabelSnapContext.() -> Unit
): LabelSnapContext {
    return LabelSnapContext()
        .apply(block)
}

/**
 * Occurs every time this instance has been [initialized][SnapContext.dragInitialized] to collect [SnapLine]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContext%23CollectSnapLines">Online Documentation</a>
 */
inline fun  LabelSnapContext.addCollectSnapLinesHandler(
    crossinline handler: (event:CollectLabelSnapLineEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<CollectLabelSnapLineEventArgs> = { _, event -> handler(event) }
    addCollectSnapLinesListener(listener)
    return { removeCollectSnapLinesListener(listener) }
}
