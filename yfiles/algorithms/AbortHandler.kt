// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.lang.YObject

/**
 * This class provides a means for early termination of graph algorithms.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler">Online Documentation</a>
 * 
 * @constructor Creates a new [AbortHandler] instance.
 * @see [stopDuration]
 * @see [cancelDuration]
 * @see [reset]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-constructor-AbortHandler">Online Documentation</a>
 */
external open class AbortHandler  () : YObject {

/**
 * Gets or sets the duration an algorithm may run before being cancelled automatically.
 * 
 * Default value - [TimeSpan.ZERO]. No automatic termination will occur.
 * @throws ArgumentError if the duration is negative
 * @see [reset]
 * @see [cancelDuration]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23cancelDuration">Online Documentation</a>
 */
open var cancelDuration: TimeSpan
/**
 * Gets whether or not methods [check] or [check] were called after a stop or cancel event.
 * @see [check]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23checkFailed">Online Documentation</a>
 */
open val checkFailed: Boolean
/**
 * Gets or sets the duration an algorithm may run before being stopped automatically.
 * 
 * Default value - [TimeSpan.ZERO]. No automatic termination will occur.
 * @throws ArgumentError if the duration is negative
 * @see [timeToStop]
 * @see [reset]
 * @see [stop]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23stopDuration">Online Documentation</a>
 */
open var stopDuration: TimeSpan
/**
 * Returns whether or not a stop request was scheduled explicitly with the [stop] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23stopRequested">Online Documentation</a>
 */
open val stopRequested: Boolean
/**
 * Determines whether or not an algorithm should terminate immediately.
 * @return `true`, if the algorithm should terminate immediately, `false` otherwise
 * @throws AlgorithmAbortedError if the algorithm should terminate immediately
 * @see [stop]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-check">Online Documentation</a>
 */
 open   fun check():Boolean
/**
 * Resets the state of the [handler][AbortHandler].
 * @see [cancelDuration]
 * @see [stopDuration]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-reset">Online Documentation</a>
 */
 open   fun reset()
/**
 * Schedules a stop request.
 * @see [check]
 * @see [cancelDuration]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-stop">Online Documentation</a>
 */
 open   fun stop()
/**
 * Determines the remaining time (in milliseconds) until an algorithm that [checks][check] this handler is cancelled automatically.
 * @return the remaining time until the algorithm is cancelled automatically.
 * @see [cancelDuration]
 * @see [reset]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-timeToCancel">Online Documentation</a>
 */
 open   fun timeToCancel():TimeSpan
/**
 * Determines the remaining time until an algorithm that [checks][check] this handler is stopped automatically.
 * @return the remaining time until the algorithm is stopped automatically or `-1` if the algorithm may run unrestricted
 * @see [stopDuration]
 * @see [reset]
 * @see [stop]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-timeToStop">Online Documentation</a>
 */
 open   fun timeToStop():TimeSpan

companion object : ClassMetadata<AbortHandler> {
/**
 * A data provider key for attaching an AbortHandler instance to a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23ABORT_HANDLER_DP_KEY">Online Documentation</a>
 */
 val ABORT_HANDLER_DP_KEY: GraphDpKey<AbortHandler>
/**
 * Determines whether or not an algorithm should terminate immediately.
 * @return `true`, if the algorithm should stop immediately while still providing some valid result, `false` otherwise
 * @throws AlgorithmAbortedError if the algorithm should terminate immediately
 * @see [check]
 * @see [stop]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-check">Online Documentation</a>
 */
 final   fun check( graph: Graph ):Boolean
/**
 * Attaches the [AbortHandler] instance of the given source graph to the target graph as well.
 * @param [source] the graph whose handler is attached to the target graph
 * @param [target] the graph to which the handler of the source graph is attached
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-copyHandler">Online Documentation</a>
 */
 final   fun copyHandler( source: Graph ,
 target: Graph )
/**
 * Creates an [handler][AbortHandler] instance and attaches it to the given graph.
 * @param [graph] the graph to which the handler will be attached
 * @return the [AbortHandler] instance for the given graph
 * @see [hasHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-createForGraph">Online Documentation</a>
 */
 final   fun createForGraph( graph: Graph ):AbortHandler
/**
 * Returns an [AbortHandler] instance for the given graph.
 * @param [graph] the given graph
 * @return an [AbortHandler] for the given graph or a non-functional instance if no handler has been previously created
 * @see [createForGraph]
 * @see [hasHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-getFromGraph">Online Documentation</a>
 */
 final   fun getFromGraph( graph: Graph ):AbortHandler
/**
 * Determines whether or not an [AbortHandler] instance is attached to the given graph.
 * @param [graph] the given graph
 * @return `true` if a handler is attached to the given graph, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-hasHandler">Online Documentation</a>
 */
 final   fun hasHandler( graph: Graph ):Boolean
/**
 * Removes any attached [AbortHandler] instance from the given graph.
 * @param [graph] the given graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AbortHandler%23AbortHandler-method-removeFromGraph">Online Documentation</a>
 */
 final   fun removeFromGraph( graph: Graph )
}
}

inline fun AbortHandler(
    block: AbortHandler.() -> Unit
): AbortHandler {
    return AbortHandler()
        .apply(block)
}
