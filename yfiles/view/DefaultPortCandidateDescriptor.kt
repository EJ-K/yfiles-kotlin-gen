// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.Tag
import yfiles.input.IHitTestable
import yfiles.input.IInputModeContext
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.input.IPortCandidate
import yfiles.lang.ClassMetadata

/**
 * An [ICanvasObjectDescriptor] implementation that can be used to draw [IPortCandidate] instances in a [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor">Online Documentation</a>
 * 
 * @constructor Instantiates a new descriptor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-constructor-DefaultPortCandidateDescriptor">Online Documentation</a>
 */
external open class DefaultPortCandidateDescriptor  () : ICanvasObjectDescriptor<IPortCandidate>, IVisualCreator, IBoundsProvider, IHitTestable, IVisibilityTestable, IMarqueeTestable, ILassoTestable {

/**
 * Gets or sets a property that determines whether this descriptor uses the "current" candidates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23currentCandidate">Online Documentation</a>
 */
final var currentCandidate: Boolean
/**
 * Gets or sets the logical size of the candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23size">Online Documentation</a>
 */
final var size: Double
/**
 * Gets or sets a value indicating whether port candidates are drawn in view coordinates, instead of intermediate coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23useViewCoordinates">Online Documentation</a>
 */
final var useViewCoordinates: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-createVisual">Online Documentation</a>
 */
 final override   fun createVisual( context: IRenderContext ):Visual?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-getBounds">Online Documentation</a>
 */
 final override   fun getBounds( context: ICanvasContext ):Rect
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-getBoundsProvider">Online Documentation</a>
 */
 final override   fun getBoundsProvider( forUserObject: IPortCandidate ):IBoundsProvider
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-getHitTestable">Online Documentation</a>
 */
 final override   fun getHitTestable( forUserObject: IPortCandidate ):IHitTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-getVisibilityTestable">Online Documentation</a>
 */
 final override   fun getVisibilityTestable( forUserObject: IPortCandidate ):IVisibilityTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-getVisualCreator">Online Documentation</a>
 */
 final override   fun getVisualCreator( forUserObject: IPortCandidate ):IVisualCreator
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-isDirty">Online Documentation</a>
 */
 final override   fun isDirty( context: ICanvasContext ,
 canvasObject: ICanvasObject ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-isHit">Online Documentation</a>
 */
 final override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-isInBox">Online Documentation</a>
 */
 final override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-isInPath">Online Documentation</a>
 */
 final override   fun isInPath( context: IInputModeContext ,
 lassoPath: GeneralPath ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-isVisible">Online Documentation</a>
 */
 final override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Sets the [IVisualTemplate] to use for the given [String] by this instance.
 * @param [resourceKey] The key to reconfigure. This is one of [CANDIDATE_DRAWING_VALID_NON_FOCUSED_KEY], [CANDIDATE_DRAWING_INVALID_NON_FOCUSED_KEY], [CANDIDATE_DRAWING_INVALID_FOCUSED_KEY], [CANDIDATE_DRAWING_VALID_FOCUSED_KEY].
 * @param [template] The template to use instead of the default.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-setTemplate">Online Documentation</a>
 */
 final   fun setTemplate( resourceKey: ResourceKey<IVisualTemplate<Tag?>> ,
 template: IVisualTemplate<Tag?>? )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23DefaultPortCandidateDescriptor-method-updateVisual">Online Documentation</a>
 */
 final override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<DefaultPortCandidateDescriptor> {
/**
 * A [String] that can be used by instances of the [DefaultPortCandidateDescriptor] to look up a [IVisualTemplate] that will be used for rendering a invalid, focused [IPortCandidate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23CANDIDATE_DRAWING_INVALID_FOCUSED_KEY">Online Documentation</a>
 */
 val CANDIDATE_DRAWING_INVALID_FOCUSED_KEY: ResourceKey<IVisualTemplate<Tag?>>
/**
 * A [String] that can be used by instances of the [DefaultPortCandidateDescriptor] to look up a [IVisualTemplate] that will be used for rendering an invalid, non-focused [IPortCandidate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23CANDIDATE_DRAWING_INVALID_NON_FOCUSED_KEY">Online Documentation</a>
 */
 val CANDIDATE_DRAWING_INVALID_NON_FOCUSED_KEY: ResourceKey<IVisualTemplate<Tag?>>
/**
 * A [String] that can be used by instances of the [DefaultPortCandidateDescriptor] to look up a [IVisualTemplate] that will be used for rendering a valid, focused [IPortCandidate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23CANDIDATE_DRAWING_VALID_FOCUSED_KEY">Online Documentation</a>
 */
 val CANDIDATE_DRAWING_VALID_FOCUSED_KEY: ResourceKey<IVisualTemplate<Tag?>>
/**
 * A [String] that can be used by instances of the [DefaultPortCandidateDescriptor] to look up a [IVisualTemplate] that will be used for rendering a valid, non-focused [IPortCandidate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidateDescriptor%23CANDIDATE_DRAWING_VALID_NON_FOCUSED_KEY">Online Documentation</a>
 */
 val CANDIDATE_DRAWING_VALID_NON_FOCUSED_KEY: ResourceKey<IVisualTemplate<Tag?>>
}
}

inline fun DefaultPortCandidateDescriptor(
    block: DefaultPortCandidateDescriptor.() -> Unit
): DefaultPortCandidateDescriptor {
    return DefaultPortCandidateDescriptor()
        .apply(block)
}
