// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IGraph
import yfiles.graph.IPort
import yfiles.graph.IPortLocationModel
import yfiles.graph.IPortLocationModelParameter
import yfiles.graph.IPortOwner
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.styles.IPortStyle

/**
 * An [IPortCandidate] implementation which can be used for candidates at existing ports as well as for candidates at a given location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate">Online Documentation</a>
 * 
 * @constructor Creates a candidate for the given `owner` that uses the graph's defaults for the port's style and the given `locationParameter`.
 * @param [owner] The owner.
 * @param [locationParameter] The location.
 * @param [validity] The validity of the port candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23DefaultPortCandidate-constructor-DefaultPortCandidate(IPortOwner,IPortLocationModelParameter,PortCandidateValidity)">Online Documentation</a>
 * 
 * @property owner
 * Gets or sets the owner of the port to be created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23owner">Online Documentation</a>
 * 
 * @property locationParameter
 * Gets or sets the model parameter that will be used for the [IPort.locationParameter] if this candidate is chosen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23locationParameter">Online Documentation</a>
 * 
 * @property validity
 * Gets or sets whether this candidate is a valid one depending on the context it has been obtained from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23validity">Online Documentation</a>
 */
external open class DefaultPortCandidate  (
final override var owner: IPortOwner,
final override var locationParameter: IPortLocationModelParameter = definedExternally,
final override var validity: PortCandidateValidity = definedExternally) : IPortCandidate {
/**
 * Creates a candidate using the given port as the template.
 * @param [port] The port to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23DefaultPortCandidate-constructor-DefaultPortCandidate(IPort)">Online Documentation</a>
 */
 constructor( port: IPort )
/**
 * Creates a candidate for the given `owner` that uses the graph's defaults for the port's style and a default parameter for the given `model`.
 * @param [owner] The owner.
 * @param [model] The model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23DefaultPortCandidate-constructor-DefaultPortCandidate(IPortOwner,IPortLocationModel)">Online Documentation</a>
 */
 constructor( owner: IPortOwner ,
 model: IPortLocationModel )

/**
 * Gets or set the tag for this candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23candidateTag">Online Documentation</a>
 */
final override var candidateTag: Tag?
/**
 * Gets or sets the model that will be used by this instance to determine the new [locationParameter] if the [getPortCandidateAt] is called and the [validity] is set to [PortCandidateValidity.DYNAMIC].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23model">Online Documentation</a>
 */
final var model: IPortLocationModel?
/**
 * Gets the instance provided to the constructor or to the [setter][setInstance].
 * @see [createPort]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23port">Online Documentation</a>
 */
override val port: IPort?
/**
 * Gets or sets the port tag to create the port with.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23portTag">Online Documentation</a>
 */
final var portTag: Tag?
/**
 * Gets or sets the style to use for the newly created port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23style">Online Documentation</a>
 */
final var style: IPortStyle?
/**
 * Actually creates the [IPort] instance.
 * @param [context] The input mode context.
 * @param [graph] The graph to add the port to.
 * @param [locationParameter] The parameter to use.
 * @param [style] The style to use.
 * @param [tag] The tag to use.
 * @return The newly created port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23DefaultPortCandidate-method-createInstance">Online Documentation</a>
 */
 open protected   fun createInstance( context: IInputModeContext ,
 graph: IGraph ,
 locationParameter: IPortLocationModelParameter ,
 style: IPortStyle ,
 tag: Tag? ):IPort
/**
 * This implementation will throw a [NotSupportedError][yfiles.lang.Exception] if the validity is [PortCandidateValidity.DYNAMIC].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23DefaultPortCandidate-method-createPort">Online Documentation</a>
 */
 override   fun createPort( context: IInputModeContext ):IPort
/**
 * Returns a candidate that is derived from this instance that best fits the provided `location`.
 * @param [context] The input mode context for which a concrete candidate is queried.
 * @param [location] The location for which a candidate should be returned.
 * @return A [IPortCandidate] implementation whose [validity] is guaranteed to be non-[PortCandidateValidity.DYNAMIC].
 * @see [validity]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23DefaultPortCandidate-method-getPortCandidateAt">Online Documentation</a>
 */
 override   fun getPortCandidateAt( context: IInputModeContext ,
 location: Point ):IPortCandidate
/**
 * Sets the instance that will be returned by [port] and [createPort].
 * @param [port] A port that already exists in the graph or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortCandidate%23DefaultPortCandidate-method-setInstance">Online Documentation</a>
 */
 open   fun setInstance( port: IPort? )

companion object : ClassMetadata<DefaultPortCandidate> {
}
}
